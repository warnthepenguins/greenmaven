/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database.tables;


import com.sylvanaqua.farmhacker.database.Farmhacker;
import com.sylvanaqua.farmhacker.database.tables.records.InventoryValueRecord;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryValue extends TableImpl<InventoryValueRecord> {

    private static final long serialVersionUID = 1265275676;

    /**
     * The reference instance of <code>farmhacker.inventory_value</code>
     */
    public static final InventoryValue INVENTORY_VALUE = new InventoryValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryValueRecord> getRecordType() {
        return InventoryValueRecord.class;
    }

    /**
     * The column <code>farmhacker.inventory_value.category</code>.
     */
    public final TableField<InventoryValueRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>farmhacker.inventory_value.name</code>.
     */
    public final TableField<InventoryValueRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>farmhacker.inventory_value.SUM(inventory.measure)</code>.
     */
    public final TableField<InventoryValueRecord, BigInteger> SUM_28INVENTORY_MEASURE_29 = createField("SUM(inventory.measure)", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(27), this, "");

    /**
     * The column <code>farmhacker.inventory_value.retail_value</code>.
     */
    public final TableField<InventoryValueRecord, Double> RETAIL_VALUE = createField("retail_value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>farmhacker.inventory_value.wholesale_value</code>.
     */
    public final TableField<InventoryValueRecord, Double> WHOLESALE_VALUE = createField("wholesale_value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>farmhacker.inventory_value</code> table reference
     */
    public InventoryValue() {
        this("inventory_value", null);
    }

    /**
     * Create an aliased <code>farmhacker.inventory_value</code> table reference
     */
    public InventoryValue(String alias) {
        this(alias, INVENTORY_VALUE);
    }

    private InventoryValue(String alias, Table<InventoryValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private InventoryValue(String alias, Table<InventoryValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Farmhacker.FARMHACKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryValue as(String alias) {
        return new InventoryValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryValue rename(String name) {
        return new InventoryValue(name, null);
    }
}
