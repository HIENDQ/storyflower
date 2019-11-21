/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import storysflower.com.storysflower.model.tables.Keys;
import storysflower.com.storysflower.model.tables.Public;
import storysflower.com.storysflower.model.tables.tables.records.ImageProductRecord;


/**
 * image product table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImageProduct extends TableImpl<ImageProductRecord> {

    private static final long serialVersionUID = 1411142064;

    /**
     * The reference instance of <code>public.image_product</code>
     */
    public static final ImageProduct IMAGE_PRODUCT = new ImageProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImageProductRecord> getRecordType() {
        return ImageProductRecord.class;
    }

    /**
     * The column <code>public.image_product.product_id</code>.
     */
    public final TableField<ImageProductRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.image_product.image_id</code>.
     */
    public final TableField<ImageProductRecord, Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.image_product.main_image</code>.
     */
    public final TableField<ImageProductRecord, Boolean> MAIN_IMAGE = createField("main_image", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.image_product</code> table reference
     */
    public ImageProduct() {
        this(DSL.name("image_product"), null);
    }

    /**
     * Create an aliased <code>public.image_product</code> table reference
     */
    public ImageProduct(String alias) {
        this(DSL.name(alias), IMAGE_PRODUCT);
    }

    /**
     * Create an aliased <code>public.image_product</code> table reference
     */
    public ImageProduct(Name alias) {
        this(alias, IMAGE_PRODUCT);
    }

    private ImageProduct(Name alias, Table<ImageProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private ImageProduct(Name alias, Table<ImageProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("image product table"));
    }

    public <O extends Record> ImageProduct(Table<O> child, ForeignKey<O, ImageProductRecord> key) {
        super(child, key, IMAGE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ImageProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ImageProductRecord, ?>>asList(Keys.IMAGE_PRODUCT__FK_PRODUCT_IMAGE, Keys.IMAGE_PRODUCT__FK_PRODUCT_IMAGE_IMAGE);
    }

    public Product product() {
        return new Product(this, Keys.IMAGE_PRODUCT__FK_PRODUCT_IMAGE);
    }

    public Image image() {
        return new Image(this, Keys.IMAGE_PRODUCT__FK_PRODUCT_IMAGE_IMAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageProduct as(String alias) {
        return new ImageProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageProduct as(Name alias) {
        return new ImageProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageProduct rename(String name) {
        return new ImageProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageProduct rename(Name name) {
        return new ImageProduct(name, null);
    }
}
