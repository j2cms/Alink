package com.alibaba.alink.operator.common.linear;

import java.util.List;

import com.alibaba.alink.common.lazy.ExtractModelInfoBatchOp;
import com.alibaba.alink.operator.batch.BatchOperator;

import org.apache.flink.ml.api.misc.param.Params;
import org.apache.flink.types.Row;

/**
 * Linear classifier model info batch op.
 */
public class LinearClassifierModelInfoBatchOp
    extends ExtractModelInfoBatchOp<LinearClassifierModelInfo, LinearClassifierModelInfoBatchOp> {

    public LinearClassifierModelInfoBatchOp() {
        this(null);
    }

    public LinearClassifierModelInfoBatchOp(Params params) {
        super(params);
    }

    @Override
    protected LinearClassifierModelInfo createModelInfo(List<Row> rows) {
        return new LinearClassifierModelInfo(rows);
    }

    @Override
    protected BatchOperator<?> processModel() {
        return this;
    }
}
