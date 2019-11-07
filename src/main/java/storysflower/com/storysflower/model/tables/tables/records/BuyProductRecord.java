/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import storysflower.com.storysflower.model.tables.tables.BuyProduct;


/**
 * buy product table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuyProductRecord extends UpdatableRecordImpl<BuyProductRecord> implements Record5<Long, Long, Long, Integer, Integer> {

    private static final long serialVersionUID = 894134629;

    /**
     * Setter for <code>public.buy_product.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.buy_product.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.buy_product.cart_id</code>.
     */
    public void setCartId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.buy_product.cart_id</code>.
     */
    public Long getCartId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.buy_product.product_id</code>.
     */
    public void setProductId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.buy_product.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.buy_product.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.buy_product.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.buy_product.status</code>.
     */
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.buy_product.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BuyProduct.BUY_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BuyProduct.BUY_PRODUCT.CART_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return BuyProduct.BUY_PRODUCT.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return BuyProduct.BUY_PRODUCT.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BuyProduct.BUY_PRODUCT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCartId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCartId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord value2(Long value) {
        setCartId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord value3(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord value5(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProductRecord values(Long value1, Long value2, Long value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BuyProductRecord
     */
    public BuyProductRecord() {
        super(BuyProduct.BUY_PRODUCT);
    }

    /**
     * Create a detached, initialised BuyProductRecord
     */
    public BuyProductRecord(Long id, Long cartId, Long productId, Integer quantity, Integer status) {
        super(BuyProduct.BUY_PRODUCT);

        set(0, id);
        set(1, cartId);
        set(2, productId);
        set(3, quantity);
        set(4, status);
    }
}
