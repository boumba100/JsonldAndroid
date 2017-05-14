package com.nbouma.jsonldjava.impl;

/**
 * Created by noah on 09/04/17.
 */

import com.nbouma.jsonldjava.core.JsonLdError;
import com.nbouma.jsonldjava.core.RDFDataset;
import com.nbouma.jsonldjava.core.RDFDatasetUtils;
import com.nbouma.jsonldjava.core.RDFParser;

public class NQuadRDFParser implements RDFParser {
    @Override
    public RDFDataset parse(Object input) throws JsonLdError {
        if (input instanceof String) {
            return RDFDatasetUtils.parseNQuads((String) input);
        } else {
            throw new JsonLdError(JsonLdError.Error.INVALID_INPUT,
                    "NQuad Parser expected string input.");
        }
    }

}