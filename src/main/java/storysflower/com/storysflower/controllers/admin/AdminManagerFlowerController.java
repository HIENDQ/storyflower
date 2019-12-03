package storysflower.com.storysflower.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import storysflower.com.storysflower.constants.UrlConstants;
import storysflower.com.storysflower.dto.OccasionDTO;
import storysflower.com.storysflower.dto.ProductDetailDTO;
import storysflower.com.storysflower.dto.ReviewDTO;
import storysflower.com.storysflower.dto.TopicDTO;
import storysflower.com.storysflower.services.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(UrlConstants.URL_ADMIN)
public class AdminManagerFlowerController {

    private static final String OCCASION = "occasion";
    private static final String OCCASIONS = "occasions";
    private static final String LIST_OCCASION = "list_occasion";


    private static final String CATEGORIES = "categories";
    private static final String PRODUCT = "product";
    private static final String REVIEWS = "reviews";
    private static final String REVIEWDTO = "reviewDTO";
    private static final String BESTRATINGPRODUCTS = "bestRatingProducts";

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    @Autowired
    ReviewService reviewService;

    @Autowired
    TopicService topicService;

    @Autowired
    private OccasionService occasionService;

    @GetMapping({UrlConstants.URL_ADMIN_PRODUCT_INDEX, UrlConstants.URL_ADMIN_PRODUCT_INDEX_ID})
    public String getAllProduct(Model model, HttpServletRequest request, RedirectAttributes redirect,
                                @PathVariable(name = "id", required = false) Long id) {
        if (id == null) id = 1L;
        model.addAttribute("occ",id);
        model.addAttribute(OCCASIONS, occasionService.findAllOccasion());
        model.addAttribute(OCCASION, occasionService.getOccasionDTOById(id));
        model.addAttribute(LIST_OCCASION, productService.getListProductDTOByOccasionId(id));
        return UrlConstants.URL_ADMIN + "/product/index_pr";
    }

    @GetMapping({UrlConstants.URL_ADMIN_PRODUCT_EDIT_ID})
    public String getProductPage(Model model, @PathVariable("id") Long id) {

        if (id == null) id = 1L;
        List<TopicDTO> listTopic= topicService.findAllTopic();
        ProductDetailDTO productDetailDTO = productService.getProductDetailDTOById(id);
        List<OccasionDTO> listOc = occasionService.findAllOccasion();
        if(productDetailDTO.getIdOccasion()>0)model.addAttribute(OCCASIONS, listOc);
        model.addAttribute(OCCASION, occasionService.getOccasionDTOById(id));
        model.addAttribute(LIST_OCCASION, productService.getListProductDTOByOccasionId(id));
        model.addAttribute(CATEGORIES, categoryService.getCategories());
        model.addAttribute(PRODUCT, productDetailDTO);
        model.addAttribute(REVIEWS, reviewService.getAllReviewsByProductId(id));
        model.addAttribute(REVIEWDTO, new ReviewDTO());
        model.addAttribute(BESTRATINGPRODUCTS, productService.getListBestProductDTOByRatting());
        model.addAttribute("listTopic",listTopic);

        return UrlConstants.URL_ADMIN + "/product/edit_pr";
    }
    @PostMapping({UrlConstants.URL_ADMIN_PRODUCT_EDIT_ID})
    public String editProduct(Model model, @PathVariable("id") Long id ,
                              @ModelAttribute("productDetailDTO") ProductDetailDTO productDetailDTO,
                              RedirectAttributes redirect) {
        productService.editProduct(productDetailDTO);
        return "redirect:"+UrlConstants.URL_ADMIN+UrlConstants.URL_ADMIN_PRODUCT_INDEX+"/"+productDetailDTO.getIdOccasion();
    }

    @GetMapping({UrlConstants.URL_ADMIN_PRODUCT_ADD})
    public String addProduct(Model model, HttpServletRequest request, RedirectAttributes redirect,
                                @PathVariable(name = "occ", required = false) Long occ ) {
        if (occ == null) occ = 1L;
        if(occ==1L){
            List<OccasionDTO> listOccision = occasionService.findAllOccasion();
            model.addAttribute("listOccision",listOccision);
            return UrlConstants.URL_ADMIN + "/product/add_pr";
        }
       else return  "";
    }

    @PostMapping({UrlConstants.URL_ADMIN_PRODUCT_ADD})
    public String addProduct(Model model, @PathVariable("occ") Long topic ,
                              @ModelAttribute("productDetailDTO") ProductDetailDTO productDetailDTO,
                              RedirectAttributes redirect) {

        productDetailDTO.setIdTopic(topic);
        System.out.println(productDetailDTO);
        if(productService.addProduct(productDetailDTO)){
            System.out.println("Done");
            return "redirect:"+UrlConstants.URL_ADMIN+UrlConstants.URL_ADMIN_PRODUCT_INDEX+"/"+productDetailDTO.getIdOccasion();
        }else{
            System.out.println("error");
            return "redirect:"+UrlConstants.URL_ADMIN+UrlConstants.URL_ADMIN_PRODUCT_INDEX+"/"+productDetailDTO.getIdOccasion();
        }
    }


}
