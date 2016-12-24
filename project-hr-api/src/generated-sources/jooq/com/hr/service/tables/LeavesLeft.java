/**
 * This class is generated by jOOQ
 */
package com.hr.service.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeavesLeft extends org.jooq.impl.TableImpl<com.hr.service.tables.records.LeavesLeftRecord> {

	private static final long serialVersionUID = -1882696850;

	/**
	 * The singleton instance of <code>hrdb_shared.leaves_left</code>
	 */
	public static final com.hr.service.tables.LeavesLeft LEAVES_LEFT = new com.hr.service.tables.LeavesLeft();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.hr.service.tables.records.LeavesLeftRecord> getRecordType() {
		return com.hr.service.tables.records.LeavesLeftRecord.class;
	}

	/**
	 * The column <code>hrdb_shared.leaves_left.id</code>.
	 */
	public final org.jooq.TableField<com.hr.service.tables.records.LeavesLeftRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb_shared.leaves_left.emp_id</code>.
	 */
	public final org.jooq.TableField<com.hr.service.tables.records.LeavesLeftRecord, java.lang.Integer> EMP_ID = createField("emp_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb_shared.leaves_left.leave_type</code>.
	 */
	public final org.jooq.TableField<com.hr.service.tables.records.LeavesLeftRecord, java.lang.Integer> LEAVE_TYPE = createField("leave_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb_shared.leaves_left.leaves_left</code>.
	 */
	public final org.jooq.TableField<com.hr.service.tables.records.LeavesLeftRecord, java.math.BigDecimal> LEAVES_LEFT_ = createField("leaves_left", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 1).nullable(false), this, "");

	/**
	 * The column <code>hrdb_shared.leaves_left.is_active</code>.
	 */
	public final org.jooq.TableField<com.hr.service.tables.records.LeavesLeftRecord, java.lang.Byte> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>hrdb_shared.leaves_left</code> table reference
	 */
	public LeavesLeft() {
		this("leaves_left", null);
	}

	/**
	 * Create an aliased <code>hrdb_shared.leaves_left</code> table reference
	 */
	public LeavesLeft(java.lang.String alias) {
		this(alias, com.hr.service.tables.LeavesLeft.LEAVES_LEFT);
	}

	private LeavesLeft(java.lang.String alias, org.jooq.Table<com.hr.service.tables.records.LeavesLeftRecord> aliased) {
		this(alias, aliased, null);
	}

	private LeavesLeft(java.lang.String alias, org.jooq.Table<com.hr.service.tables.records.LeavesLeftRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.hr.service.HrdbShared.HRDB_SHARED, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.hr.service.tables.records.LeavesLeftRecord, java.lang.Integer> getIdentity() {
		return com.hr.service.Keys.IDENTITY_LEAVES_LEFT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.hr.service.tables.records.LeavesLeftRecord> getPrimaryKey() {
		return com.hr.service.Keys.KEY_LEAVES_LEFT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.hr.service.tables.records.LeavesLeftRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.hr.service.tables.records.LeavesLeftRecord>>asList(com.hr.service.Keys.KEY_LEAVES_LEFT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.hr.service.tables.records.LeavesLeftRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.hr.service.tables.records.LeavesLeftRecord, ?>>asList(com.hr.service.Keys.LEAVES_LEFT_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.hr.service.tables.LeavesLeft as(java.lang.String alias) {
		return new com.hr.service.tables.LeavesLeft(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.hr.service.tables.LeavesLeft rename(java.lang.String name) {
		return new com.hr.service.tables.LeavesLeft(name, null);
	}
}