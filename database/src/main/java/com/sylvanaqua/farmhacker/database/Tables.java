/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database;


import com.sylvanaqua.farmhacker.database.tables.Catalog;
import com.sylvanaqua.farmhacker.database.tables.CatalogCategoryVw;
import com.sylvanaqua.farmhacker.database.tables.FarmhackerUser;
import com.sylvanaqua.farmhacker.database.tables.Inventory;
import com.sylvanaqua.farmhacker.database.tables.InventoryValue;
import com.sylvanaqua.farmhacker.database.tables.SchemaVersion;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in farmhacker
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>farmhacker.catalog</code>.
     */
    public static final Catalog CATALOG = com.sylvanaqua.farmhacker.database.tables.Catalog.CATALOG;

    /**
     * VIEW
     */
    public static final CatalogCategoryVw CATALOG_CATEGORY_VW = com.sylvanaqua.farmhacker.database.tables.CatalogCategoryVw.CATALOG_CATEGORY_VW;

    /**
     * The table <code>farmhacker.farmhacker_user</code>.
     */
    public static final FarmhackerUser FARMHACKER_USER = com.sylvanaqua.farmhacker.database.tables.FarmhackerUser.FARMHACKER_USER;

    /**
     * The table <code>farmhacker.inventory</code>.
     */
    public static final Inventory INVENTORY = com.sylvanaqua.farmhacker.database.tables.Inventory.INVENTORY;

    /**
     * VIEW
     */
    public static final InventoryValue INVENTORY_VALUE = com.sylvanaqua.farmhacker.database.tables.InventoryValue.INVENTORY_VALUE;

    /**
     * The table <code>farmhacker.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.sylvanaqua.farmhacker.database.tables.SchemaVersion.SCHEMA_VERSION;
}
