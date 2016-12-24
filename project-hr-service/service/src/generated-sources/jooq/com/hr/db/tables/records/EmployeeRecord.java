/**
 * This class is generated by jOOQ
 */
package com.hr.db.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeRecord extends org.jooq.impl.UpdatableRecordImpl<com.hr.db.tables.records.EmployeeRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 182860481;

	/**
	 * Setter for <code>hrdb_shared.employee.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb_shared.employee.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb_shared.employee.first_name</code>.
	 */
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb_shared.employee.first_name</code>.
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>hrdb_shared.employee.last_name</code>.
	 */
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb_shared.employee.last_name</code>.
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>hrdb_shared.employee.full_name</code>.
	 */
	public void setFullName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb_shared.employee.full_name</code>.
	 */
	public java.lang.String getFullName() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.hr.db.tables.Employee.EMPLOYEE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.hr.db.tables.Employee.EMPLOYEE.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.hr.db.tables.Employee.EMPLOYEE.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.hr.db.tables.Employee.EMPLOYEE.FULL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getFullName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value2(java.lang.String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value3(java.lang.String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord value4(java.lang.String value) {
		setFullName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmployeeRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmployeeRecord
	 */
	public EmployeeRecord() {
		super(com.hr.db.tables.Employee.EMPLOYEE);
	}

	/**
	 * Create a detached, initialised EmployeeRecord
	 */
	public EmployeeRecord(java.lang.Integer id, java.lang.String firstName, java.lang.String lastName, java.lang.String fullName) {
		super(com.hr.db.tables.Employee.EMPLOYEE);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, fullName);
	}
}