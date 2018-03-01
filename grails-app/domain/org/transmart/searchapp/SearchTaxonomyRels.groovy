package org.transmart.searchapp

class SearchTaxonomyRels {
	SearchTaxonomy child
	SearchTaxonomy parent

	static mapping = {
		id generator: 'sequence', params: [sequence: 'SEQ_SEARCH_TAXONOMY_RELS_ID'], column: 'SEARCH_TAXONOMY_RELS_ID'
		version false
	}

	static constraints = {
		parent nullable: true
	}
}
