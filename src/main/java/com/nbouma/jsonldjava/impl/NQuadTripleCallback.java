package com.nbouma.jsonldjava.impl;

import com.nbouma.jsonldjava.core.JsonLdTripleCallback;
import com.nbouma.jsonldjava.core.RDFDataset;
import com.nbouma.jsonldjava.core.RDFDatasetUtils;

public class NQuadTripleCallback implements JsonLdTripleCallback {
    @Override
    public Object call(RDFDataset dataset) {
        return RDFDatasetUtils.toNQuads(dataset);
    }
}