/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import storysflower.com.storysflower.model.tables.tables.ProductCategory;


/**
 * product category table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductCategoryRecord extends TableRecordImpl<ProductCategoryRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1496326757;

    /**
     * Setter for <code>public.product_category.product_id</code>.
     */
    public void setProductId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.product_category.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.product_category.category_id</code>.
     */
    public void setCategoryId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.product_category.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ProductCategory.PRODUCT_CATEGORY.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ProductCategory.PRODUCT_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value1(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord value2(Long value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductCategoryRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductCategoryRecord
     */
    public ProductCategoryRecord() {
        super(ProductCategory.PRODUCT_CATEGORY);
    }

    /**
     * Create a detached, initialised ProductCategoryRecord
     */
    public ProductCategoryRecord(Long productId, Long categoryId) {
        super(ProductCategory.PRODUCT_CATEGORY);

        set(0, productId);
        set(1, categoryId);
    }
}
