package com.taobao.tddl.executor.function.scalar;

import com.taobao.tddl.executor.function.ScalarFunction;
import com.taobao.tddl.optimizer.core.expression.ISelectable.DATA_TYPE;

/**
 * @since 5.1.0
 */
public class Curtime extends ScalarFunction {

    public Object getResult() {
        return result;
    }

    public void compute(Object[] args) {
        result = new java.sql.Time(new java.util.Date().getTime());
    }

    public DATA_TYPE getReturnType() {
        return DATA_TYPE.DATE_VAL;
    }

}
