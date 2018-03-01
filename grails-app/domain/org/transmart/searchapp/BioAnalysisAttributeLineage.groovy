package org.transmart.searchapp

import org.transmart.biomart.BioAnalysisAttribute

class BioAnalysisAttributeLineage {
	SearchTaxonomy ancestorTerm
	BioAnalysisAttribute bioAnalysisAttribute

	static mapping = {
		id column: 'BIO_ANALYSIS_ATT_LINEAGE_ID'
		version false
	}
}
