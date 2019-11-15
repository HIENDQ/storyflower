/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import storysflower.com.storysflower.model.tables.tables.BuyProduct;
import storysflower.com.storysflower.model.tables.tables.Cart;
import storysflower.com.storysflower.model.tables.tables.Category;
import storysflower.com.storysflower.model.tables.tables.Customer;
import storysflower.com.storysflower.model.tables.tables.DealProduct;
import storysflower.com.storysflower.model.tables.tables.Favourite;
import storysflower.com.storysflower.model.tables.tables.Image;
import storysflower.com.storysflower.model.tables.tables.ImageProduct;
import storysflower.com.storysflower.model.tables.tables.Occasion;
import storysflower.com.storysflower.model.tables.tables.Product;
import storysflower.com.storysflower.model.tables.tables.ProductCategory;
import storysflower.com.storysflower.model.tables.tables.Rating;
import storysflower.com.storysflower.model.tables.tables.Recipient;
import storysflower.com.storysflower.model.tables.tables.Review;
import storysflower.com.storysflower.model.tables.tables.Topic;
import storysflower.com.storysflower.model.tables.tables.User;
import storysflower.com.storysflower.model.tables.tables.UserRole;
import storysflower.com.storysflower.model.tables.tables.records.BuyProductRecord;
import storysflower.com.storysflower.model.tables.tables.records.CartRecord;
import storysflower.com.storysflower.model.tables.tables.records.CategoryRecord;
import storysflower.com.storysflower.model.tables.tables.records.CustomerRecord;
import storysflower.com.storysflower.model.tables.tables.records.DealProductRecord;
import storysflower.com.storysflower.model.tables.tables.records.FavouriteRecord;
import storysflower.com.storysflower.model.tables.tables.records.ImageProductRecord;
import storysflower.com.storysflower.model.tables.tables.records.ImageRecord;
import storysflower.com.storysflower.model.tables.tables.records.OccasionRecord;
import storysflower.com.storysflower.model.tables.tables.records.ProductCategoryRecord;
import storysflower.com.storysflower.model.tables.tables.records.ProductRecord;
import storysflower.com.storysflower.model.tables.tables.records.RatingRecord;
import storysflower.com.storysflower.model.tables.tables.records.RecipientRecord;
import storysflower.com.storysflower.model.tables.tables.records.ReviewRecord;
import storysflower.com.storysflower.model.tables.tables.records.TopicRecord;
import storysflower.com.storysflower.model.tables.tables.records.UserRecord;
import storysflower.com.storysflower.model.tables.tables.records.UserRoleRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BuyProductRecord, Long> IDENTITY_BUY_PRODUCT = Identities0.IDENTITY_BUY_PRODUCT;
    public static final Identity<CartRecord, Long> IDENTITY_CART = Identities0.IDENTITY_CART;
    public static final Identity<CategoryRecord, Long> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CustomerRecord, Long> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<DealProductRecord, Long> IDENTITY_DEAL_PRODUCT = Identities0.IDENTITY_DEAL_PRODUCT;
    public static final Identity<FavouriteRecord, Long> IDENTITY_FAVOURITE = Identities0.IDENTITY_FAVOURITE;
    public static final Identity<ImageRecord, Long> IDENTITY_IMAGE = Identities0.IDENTITY_IMAGE;
    public static final Identity<OccasionRecord, Long> IDENTITY_OCCASION = Identities0.IDENTITY_OCCASION;
    public static final Identity<ProductRecord, Long> IDENTITY_PRODUCT = Identities0.IDENTITY_PRODUCT;
    public static final Identity<RatingRecord, Long> IDENTITY_RATING = Identities0.IDENTITY_RATING;
    public static final Identity<RecipientRecord, Long> IDENTITY_RECIPIENT = Identities0.IDENTITY_RECIPIENT;
    public static final Identity<ReviewRecord, Long> IDENTITY_REVIEW = Identities0.IDENTITY_REVIEW;
    public static final Identity<TopicRecord, Long> IDENTITY_TOPIC = Identities0.IDENTITY_TOPIC;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BuyProductRecord> BUY_PRODUCT_PKEY = UniqueKeys0.BUY_PRODUCT_PKEY;
    public static final UniqueKey<CartRecord> CART_PKEY = UniqueKeys0.CART_PKEY;
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = UniqueKeys0.CATEGORY_PKEY;
    public static final UniqueKey<CategoryRecord> CATEGORY_CATEGORY_NAME_KEY = UniqueKeys0.CATEGORY_CATEGORY_NAME_KEY;
    public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = UniqueKeys0.CUSTOMER_PKEY;
    public static final UniqueKey<CustomerRecord> CUSTOMER_EMAIL_KEY = UniqueKeys0.CUSTOMER_EMAIL_KEY;
    public static final UniqueKey<DealProductRecord> DEAL_PRODUCT_PKEY = UniqueKeys0.DEAL_PRODUCT_PKEY;
    public static final UniqueKey<FavouriteRecord> FAVOURITE_PKEY = UniqueKeys0.FAVOURITE_PKEY;
    public static final UniqueKey<ImageRecord> IMAGE_PKEY = UniqueKeys0.IMAGE_PKEY;
    public static final UniqueKey<OccasionRecord> OCCASION_PKEY = UniqueKeys0.OCCASION_PKEY;
    public static final UniqueKey<OccasionRecord> OCCASION_NAME_OCCASION_KEY = UniqueKeys0.OCCASION_NAME_OCCASION_KEY;
    public static final UniqueKey<ProductRecord> PRODUCT_PKEY = UniqueKeys0.PRODUCT_PKEY;
    public static final UniqueKey<RatingRecord> RATING_PKEY = UniqueKeys0.RATING_PKEY;
    public static final UniqueKey<RecipientRecord> RECIPIENT_PKEY = UniqueKeys0.RECIPIENT_PKEY;
    public static final UniqueKey<ReviewRecord> REVIEW_PKEY = UniqueKeys0.REVIEW_PKEY;
    public static final UniqueKey<TopicRecord> TOPIC_PKEY = UniqueKeys0.TOPIC_PKEY;
    public static final UniqueKey<TopicRecord> TOPIC_TOPIC_NAME_KEY = UniqueKeys0.TOPIC_TOPIC_NAME_KEY;
    public static final UniqueKey<UserRecord> USER_PKEY = UniqueKeys0.USER_PKEY;
    public static final UniqueKey<UserRecord> USER_EMAIL_KEY = UniqueKeys0.USER_EMAIL_KEY;
    public static final UniqueKey<UserRoleRecord> USER_ROLE_PKEY = UniqueKeys0.USER_ROLE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BuyProductRecord, CartRecord> BUY_PRODUCT__FK_BUY_PRODUCT_CART = ForeignKeys0.BUY_PRODUCT__FK_BUY_PRODUCT_CART;
    public static final ForeignKey<BuyProductRecord, ProductRecord> BUY_PRODUCT__FK_BUY_PRODUCT_PRODUCT = ForeignKeys0.BUY_PRODUCT__FK_BUY_PRODUCT_PRODUCT;
    public static final ForeignKey<CartRecord, CustomerRecord> CART__FK_CART_CUSTOMER = ForeignKeys0.CART__FK_CART_CUSTOMER;
    public static final ForeignKey<CartRecord, RecipientRecord> CART__FK_CART_RECIPIENT = ForeignKeys0.CART__FK_CART_RECIPIENT;
    public static final ForeignKey<DealProductRecord, ProductRecord> DEAL_PRODUCT__FK_DEAL_PRODUCT_PRODUCT = ForeignKeys0.DEAL_PRODUCT__FK_DEAL_PRODUCT_PRODUCT;
    public static final ForeignKey<FavouriteRecord, ProductRecord> FAVOURITE__FK_FAVOURITE_PRODUCT = ForeignKeys0.FAVOURITE__FK_FAVOURITE_PRODUCT;
    public static final ForeignKey<FavouriteRecord, UserRecord> FAVOURITE__FK_FAVOURITE_USER = ForeignKeys0.FAVOURITE__FK_FAVOURITE_USER;
    public static final ForeignKey<ImageProductRecord, ProductRecord> IMAGE_PRODUCT__FK_PRODUCT_IMAGE = ForeignKeys0.IMAGE_PRODUCT__FK_PRODUCT_IMAGE;
    public static final ForeignKey<ImageProductRecord, ImageRecord> IMAGE_PRODUCT__FK_PRODUCT_IMAGE_IMAGE = ForeignKeys0.IMAGE_PRODUCT__FK_PRODUCT_IMAGE_IMAGE;
    public static final ForeignKey<OccasionRecord, ImageRecord> OCCASION__FK_OCCASION_IMAGE = ForeignKeys0.OCCASION__FK_OCCASION_IMAGE;
    public static final ForeignKey<ProductRecord, TopicRecord> PRODUCT__FK_PRODUCT_TOPIC = ForeignKeys0.PRODUCT__FK_PRODUCT_TOPIC;
    public static final ForeignKey<ProductRecord, OccasionRecord> PRODUCT__FK_PRODUCT_OCCASION = ForeignKeys0.PRODUCT__FK_PRODUCT_OCCASION;
    public static final ForeignKey<ProductCategoryRecord, ProductRecord> PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_PRODUCT = ForeignKeys0.PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_PRODUCT;
    public static final ForeignKey<ProductCategoryRecord, CategoryRecord> PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_CATEGORY = ForeignKeys0.PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_CATEGORY;
    public static final ForeignKey<RatingRecord, ProductRecord> RATING__FK_RATING_PRODUCT = ForeignKeys0.RATING__FK_RATING_PRODUCT;
    public static final ForeignKey<RatingRecord, UserRecord> RATING__FK_RATING_USER_ID = ForeignKeys0.RATING__FK_RATING_USER_ID;
    public static final ForeignKey<ReviewRecord, ProductRecord> REVIEW__FK_REVIEW_PRODUCT = ForeignKeys0.REVIEW__FK_REVIEW_PRODUCT;
    public static final ForeignKey<ReviewRecord, UserRecord> REVIEW__FK_REVIEW_USER = ForeignKeys0.REVIEW__FK_REVIEW_USER;
    public static final ForeignKey<UserRoleRecord, UserRecord> USER_ROLE__FK_USER_ROLE_USER = ForeignKeys0.USER_ROLE__FK_USER_ROLE_USER;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BuyProductRecord, Long> IDENTITY_BUY_PRODUCT = Internal.createIdentity(BuyProduct.BUY_PRODUCT, BuyProduct.BUY_PRODUCT.ID);
        public static Identity<CartRecord, Long> IDENTITY_CART = Internal.createIdentity(Cart.CART, Cart.CART.ID);
        public static Identity<CategoryRecord, Long> IDENTITY_CATEGORY = Internal.createIdentity(Category.CATEGORY, Category.CATEGORY.ID);
        public static Identity<CustomerRecord, Long> IDENTITY_CUSTOMER = Internal.createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.ID);
        public static Identity<DealProductRecord, Long> IDENTITY_DEAL_PRODUCT = Internal.createIdentity(DealProduct.DEAL_PRODUCT, DealProduct.DEAL_PRODUCT.ID);
        public static Identity<FavouriteRecord, Long> IDENTITY_FAVOURITE = Internal.createIdentity(Favourite.FAVOURITE, Favourite.FAVOURITE.ID);
        public static Identity<ImageRecord, Long> IDENTITY_IMAGE = Internal.createIdentity(Image.IMAGE, Image.IMAGE.IMAGE_ID);
        public static Identity<OccasionRecord, Long> IDENTITY_OCCASION = Internal.createIdentity(Occasion.OCCASION, Occasion.OCCASION.OCCASION_ID);
        public static Identity<ProductRecord, Long> IDENTITY_PRODUCT = Internal.createIdentity(Product.PRODUCT, Product.PRODUCT.ID);
        public static Identity<RatingRecord, Long> IDENTITY_RATING = Internal.createIdentity(Rating.RATING, Rating.RATING.ID);
        public static Identity<RecipientRecord, Long> IDENTITY_RECIPIENT = Internal.createIdentity(Recipient.RECIPIENT, Recipient.RECIPIENT.ID);
        public static Identity<ReviewRecord, Long> IDENTITY_REVIEW = Internal.createIdentity(Review.REVIEW, Review.REVIEW.ID);
        public static Identity<TopicRecord, Long> IDENTITY_TOPIC = Internal.createIdentity(Topic.TOPIC, Topic.TOPIC.TOPIC_ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
        public static Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Internal.createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BuyProductRecord> BUY_PRODUCT_PKEY = Internal.createUniqueKey(BuyProduct.BUY_PRODUCT, "buy_product_pkey", BuyProduct.BUY_PRODUCT.ID);
        public static final UniqueKey<CartRecord> CART_PKEY = Internal.createUniqueKey(Cart.CART, "cart_pkey", Cart.CART.ID);
        public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = Internal.createUniqueKey(Category.CATEGORY, "category_pkey", Category.CATEGORY.ID);
        public static final UniqueKey<CategoryRecord> CATEGORY_CATEGORY_NAME_KEY = Internal.createUniqueKey(Category.CATEGORY, "category_category_name_key", Category.CATEGORY.CATEGORY_NAME);
        public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = Internal.createUniqueKey(Customer.CUSTOMER, "customer_pkey", Customer.CUSTOMER.ID);
        public static final UniqueKey<CustomerRecord> CUSTOMER_EMAIL_KEY = Internal.createUniqueKey(Customer.CUSTOMER, "customer_email_key", Customer.CUSTOMER.EMAIL);
        public static final UniqueKey<DealProductRecord> DEAL_PRODUCT_PKEY = Internal.createUniqueKey(DealProduct.DEAL_PRODUCT, "deal_product_pkey", DealProduct.DEAL_PRODUCT.ID);
        public static final UniqueKey<FavouriteRecord> FAVOURITE_PKEY = Internal.createUniqueKey(Favourite.FAVOURITE, "favourite_pkey", Favourite.FAVOURITE.ID);
        public static final UniqueKey<ImageRecord> IMAGE_PKEY = Internal.createUniqueKey(Image.IMAGE, "image_pkey", Image.IMAGE.IMAGE_ID);
        public static final UniqueKey<OccasionRecord> OCCASION_PKEY = Internal.createUniqueKey(Occasion.OCCASION, "occasion_pkey", Occasion.OCCASION.OCCASION_ID);
        public static final UniqueKey<OccasionRecord> OCCASION_NAME_OCCASION_KEY = Internal.createUniqueKey(Occasion.OCCASION, "occasion_name_occasion_key", Occasion.OCCASION.NAME_OCCASION);
        public static final UniqueKey<ProductRecord> PRODUCT_PKEY = Internal.createUniqueKey(Product.PRODUCT, "product_pkey", Product.PRODUCT.ID);
        public static final UniqueKey<RatingRecord> RATING_PKEY = Internal.createUniqueKey(Rating.RATING, "rating_pkey", Rating.RATING.ID);
        public static final UniqueKey<RecipientRecord> RECIPIENT_PKEY = Internal.createUniqueKey(Recipient.RECIPIENT, "recipient_pkey", Recipient.RECIPIENT.ID);
        public static final UniqueKey<ReviewRecord> REVIEW_PKEY = Internal.createUniqueKey(Review.REVIEW, "review_pkey", Review.REVIEW.ID);
        public static final UniqueKey<TopicRecord> TOPIC_PKEY = Internal.createUniqueKey(Topic.TOPIC, "topic_pkey", Topic.TOPIC.TOPIC_ID);
        public static final UniqueKey<TopicRecord> TOPIC_TOPIC_NAME_KEY = Internal.createUniqueKey(Topic.TOPIC, "topic_topic_name_key", Topic.TOPIC.TOPIC_NAME);
        public static final UniqueKey<UserRecord> USER_PKEY = Internal.createUniqueKey(User.USER, "user_pkey", User.USER.ID);
        public static final UniqueKey<UserRecord> USER_EMAIL_KEY = Internal.createUniqueKey(User.USER, "user_email_key", User.USER.EMAIL);
        public static final UniqueKey<UserRoleRecord> USER_ROLE_PKEY = Internal.createUniqueKey(UserRole.USER_ROLE, "user_role_pkey", UserRole.USER_ROLE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BuyProductRecord, CartRecord> BUY_PRODUCT__FK_BUY_PRODUCT_CART = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.CART_PKEY, BuyProduct.BUY_PRODUCT, "buy_product__fk_buy_product_cart", BuyProduct.BUY_PRODUCT.CART_ID);
        public static final ForeignKey<BuyProductRecord, ProductRecord> BUY_PRODUCT__FK_BUY_PRODUCT_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, BuyProduct.BUY_PRODUCT, "buy_product__fk_buy_product_product", BuyProduct.BUY_PRODUCT.PRODUCT_ID);
        public static final ForeignKey<CartRecord, CustomerRecord> CART__FK_CART_CUSTOMER = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.CUSTOMER_PKEY, Cart.CART, "cart__fk_cart_customer", Cart.CART.CUSTOMER_ID);
        public static final ForeignKey<CartRecord, RecipientRecord> CART__FK_CART_RECIPIENT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.RECIPIENT_PKEY, Cart.CART, "cart__fk_cart_recipient", Cart.CART.RECIPIENT_ID);
        public static final ForeignKey<DealProductRecord, ProductRecord> DEAL_PRODUCT__FK_DEAL_PRODUCT_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, DealProduct.DEAL_PRODUCT, "deal_product__fk_deal_product_product", DealProduct.DEAL_PRODUCT.PRODUCT_ID);
        public static final ForeignKey<FavouriteRecord, ProductRecord> FAVOURITE__FK_FAVOURITE_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, Favourite.FAVOURITE, "favourite__fk_favourite_product", Favourite.FAVOURITE.PRODUCT_ID);
        public static final ForeignKey<FavouriteRecord, UserRecord> FAVOURITE__FK_FAVOURITE_USER = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.USER_PKEY, Favourite.FAVOURITE, "favourite__fk_favourite_user", Favourite.FAVOURITE.USER_ID);
        public static final ForeignKey<ImageProductRecord, ProductRecord> IMAGE_PRODUCT__FK_PRODUCT_IMAGE = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, ImageProduct.IMAGE_PRODUCT, "image_product__fk_product_image", ImageProduct.IMAGE_PRODUCT.PRODUCT_ID);
        public static final ForeignKey<ImageProductRecord, ImageRecord> IMAGE_PRODUCT__FK_PRODUCT_IMAGE_IMAGE = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.IMAGE_PKEY, ImageProduct.IMAGE_PRODUCT, "image_product__fk_product_image_image", ImageProduct.IMAGE_PRODUCT.IMAGE_ID);
        public static final ForeignKey<OccasionRecord, ImageRecord> OCCASION__FK_OCCASION_IMAGE = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.IMAGE_PKEY, Occasion.OCCASION, "occasion__fk_occasion_image", Occasion.OCCASION.IMAGE_ID);
        public static final ForeignKey<ProductRecord, TopicRecord> PRODUCT__FK_PRODUCT_TOPIC = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.TOPIC_PKEY, Product.PRODUCT, "product__fk_product_topic", Product.PRODUCT.TOPIC_ID);
        public static final ForeignKey<ProductRecord, OccasionRecord> PRODUCT__FK_PRODUCT_OCCASION = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.OCCASION_PKEY, Product.PRODUCT, "product__fk_product_occasion", Product.PRODUCT.OCCASION_ID);
        public static final ForeignKey<ProductCategoryRecord, ProductRecord> PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, ProductCategory.PRODUCT_CATEGORY, "product_category__fk_category_product_product", ProductCategory.PRODUCT_CATEGORY.PRODUCT_ID);
        public static final ForeignKey<ProductCategoryRecord, CategoryRecord> PRODUCT_CATEGORY__FK_CATEGORY_PRODUCT_CATEGORY = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.CATEGORY_PKEY, ProductCategory.PRODUCT_CATEGORY, "product_category__fk_category_product_category", ProductCategory.PRODUCT_CATEGORY.CATEGORY_ID);
        public static final ForeignKey<RatingRecord, ProductRecord> RATING__FK_RATING_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, Rating.RATING, "rating__fk_rating_product", Rating.RATING.PRODUCT_ID);
        public static final ForeignKey<RatingRecord, UserRecord> RATING__FK_RATING_USER_ID = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.USER_PKEY, Rating.RATING, "rating__fk_rating_user_id", Rating.RATING.USER_ID);
        public static final ForeignKey<ReviewRecord, ProductRecord> REVIEW__FK_REVIEW_PRODUCT = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.PRODUCT_PKEY, Review.REVIEW, "review__fk_review_product", Review.REVIEW.PRODUCT_ID);
        public static final ForeignKey<ReviewRecord, UserRecord> REVIEW__FK_REVIEW_USER = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.USER_PKEY, Review.REVIEW, "review__fk_review_user", Review.REVIEW.USER_ID);
        public static final ForeignKey<UserRoleRecord, UserRecord> USER_ROLE__FK_USER_ROLE_USER = Internal.createForeignKey(storysflower.com.storysflower.model.tables.Keys.USER_EMAIL_KEY, UserRole.USER_ROLE, "user_role__fk_user_role_user", UserRole.USER_ROLE.EMAIL);
    }
}
