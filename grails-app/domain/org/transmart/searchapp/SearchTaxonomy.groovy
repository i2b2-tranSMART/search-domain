package org.transmart.searchapp

class SearchTaxonomy {
	Date importDate
	Long searchKeywordId
	String sourceCd
	String termName

	List children = []
	List parents = []

	static transients = ['children', 'parents']

	static mapping = {
		id generator: 'sequence', params: [sequence: 'SEQ_SEARCH_TAXONOMY_TERM_ID'], column: 'TERM_ID'
		version false
	}

	static constraints = {
		importDate nullable: true
		sourceCd nullable: true, maxSize: 900
		termName maxSize: 900
	}
}
