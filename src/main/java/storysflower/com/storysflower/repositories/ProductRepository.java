package storysflower.com.storysflower.repositories;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import storysflower.com.storysflower.dto.CategoryDTO;
import storysflower.com.storysflower.dto.ProductDTO;
import storysflower.com.storysflower.dto.ProductDetailDTO;
import storysflower.com.storysflower.services.RattingService;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static storysflower.com.storysflower.model.tables.Tables.*;
import static storysflower.com.storysflower.model.tables.tables.Product.PRODUCT;
import static storysflower.com.storysflower.model.tables.tables.Topic.TOPIC;

/**
 * @author ntynguyen
 */
@Repository
public class ProductRepository {
    @Autowired
    DSLContext dslContext;

    @Autowired
    RatingRepository ratingRepository;

    @Autowired
    RattingService rattingService;

    public ProductDetailDTO getProductDetailByProductId(Long id) {
        ProductDetailDTO productDetailDTO = dslContext
                .select(PRODUCT.ID, IMAGE_PRODUCT.IMAGE_ID, PRODUCT.PRODUCT_NAME, OCCASION.NAME_OCCASION, TOPIC.TOPIC_NAME, PRODUCT.DESCRIPTION, PRODUCT.MEANING, PRODUCT.PRICE)
                .from(PRODUCT)
                .join(OCCASION).on(OCCASION.OCCASION_ID.eq(PRODUCT.OCCASION_ID))
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .join(TOPIC).on(TOPIC.TOPIC_ID.eq(PRODUCT.TOPIC_ID))
                .where(PRODUCT.ID.eq(id))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .fetchOneInto(ProductDetailDTO.class);
        List<CategoryDTO> categories = getCategoriesByProductId(id);
        if (categories.size() == 0) {
            productDetailDTO.setCategories(Collections.emptyList());
        } else {
            productDetailDTO.setCategories(categories);
        }
        productDetailDTO.setRating(ratingRepository.getRate(productDetailDTO.getId()));
        List<Long> imageIds = getListImageIdByProductId(id);
        if(imageIds.size() == 0){
            productDetailDTO.setImageIds(Collections.emptyList());
        }
        else {
            productDetailDTO.setImageIds(imageIds);
        }
        return productDetailDTO;
    }

    public List<Long> getListImageIdByProductId(Long productId) {
        List<Long> imageIds = dslContext.select(IMAGE_PRODUCT.IMAGE_ID)
                .from(IMAGE_PRODUCT)
                .where(IMAGE_PRODUCT.PRODUCT_ID.eq(productId))
                .fetchInto(Long.class);
        return imageIds.size() == 0 ? Collections.emptyList() : imageIds;
    }

    public List<CategoryDTO> getCategoriesByProductId(Long productId) {
        List<CategoryDTO> categories = dslContext
                .select(CATEGORY.CATEGORY_NAME, CATEGORY.CATEGORY_MEANING)
                .from(PRODUCT_CATEGORY)
                .join(PRODUCT)
                .on(PRODUCT.ID.eq(PRODUCT_CATEGORY.PRODUCT_ID))
                .join(CATEGORY)
                .on(CATEGORY.ID.eq(PRODUCT_CATEGORY.CATEGORY_ID))
                .where(PRODUCT.ID.eq(productId))
                .fetchInto(CategoryDTO.class);
        return categories.size() == 0 ? Collections.emptyList() : categories;
    }

    public List<ProductDTO> getListProductDTOByOccasionId(Long occasionId) {
        List<ProductDTO> productDTOS = dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .where(PRODUCT.OCCASION_ID.eq(occasionId))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .fetchInto(ProductDTO.class);
        rattingService.setRating(productDTOS);
        return productDTOS.size() == 0 ? Collections.emptyList() : productDTOS;
    }

    public List<ProductDTO> getListBestProductDTOByRatting(){
        List<ProductDTO> productDTOS = dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .fetchInto(ProductDTO.class);
        rattingService.setRating(productDTOS);
        return productDTOS.stream().sorted((t1,t2)-> t2.getRating() - t1.getRating()).collect(Collectors.toList()).subList(0,3);
    }

    public ProductDTO getProductDTOById(Long productId) {
        return dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .where(PRODUCT.ID.eq(productId))
                .fetchAnyInto(ProductDTO.class);

    }

    public List<ProductDTO> getListBestProductDTOByRattingAndOccasion(Long occasionId) {
        List<ProductDTO> productDTOS = dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .where(PRODUCT.OCCASION_ID.eq(occasionId))
                .fetchInto(ProductDTO.class);
        rattingService.setRating(productDTOS);
        return productDTOS.stream().sorted((t1,t2)-> t2.getRating() - t1.getRating()).collect(Collectors.toList()).subList(0,3);
    }

    public List<ProductDTO> getListBestProductDTOBySellerAndOccasion(Long occasionId) {
        return null;
    }

    public List<ProductDTO> getAllFlowers() {
        return dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .where(PRODUCT.TOPIC_ID.eq(1L))
                .fetchInto(ProductDTO.class);
    }

    public List<ProductDTO> getAllGitfSweet() {
        return dslContext.select()
                .from(PRODUCT)
                .join(IMAGE_PRODUCT).on(IMAGE_PRODUCT.PRODUCT_ID.eq(PRODUCT.ID))
                .and(IMAGE_PRODUCT.MAIN_IMAGE.eq(true))
                .where(PRODUCT.TOPIC_ID.eq(3L))
                .fetchInto(ProductDTO.class);
    }
}
