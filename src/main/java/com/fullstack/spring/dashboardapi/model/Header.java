/**
 * 
 */
package com.fullstack.spring.dashboardapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jokersingh
 *
 */
@Entity
@Table(name = "TBL_HEADER")
@JsonIgnoreProperties(value = {"id"})
public class Header implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8460161315666767037L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "HEADER_NAME")
	private String headerName;
	@Column(name = "FIELD")
	private String field;
	@Column(name = "SORTABLE")
	private boolean sortable;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeaderName() {
		return headerName;
	}
	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public boolean isSortable() {
		return sortable;
	}
	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}
}
