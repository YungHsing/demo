package com.example.demo.dao.entities;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.vo.Page;

public class FunctionListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public FunctionListExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFnGroupNoIsNull() {
            addCriterion("FN_GROUP_NO is null");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoIsNotNull() {
            addCriterion("FN_GROUP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoEqualTo(String value) {
            addCriterion("FN_GROUP_NO =", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoNotEqualTo(String value) {
            addCriterion("FN_GROUP_NO <>", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoGreaterThan(String value) {
            addCriterion("FN_GROUP_NO >", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("FN_GROUP_NO >=", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoLessThan(String value) {
            addCriterion("FN_GROUP_NO <", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoLessThanOrEqualTo(String value) {
            addCriterion("FN_GROUP_NO <=", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoLike(String value) {
            addCriterion("FN_GROUP_NO like", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoNotLike(String value) {
            addCriterion("FN_GROUP_NO not like", value, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoIn(List<String> values) {
            addCriterion("FN_GROUP_NO in", values, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoNotIn(List<String> values) {
            addCriterion("FN_GROUP_NO not in", values, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoBetween(String value1, String value2) {
            addCriterion("FN_GROUP_NO between", value1, value2, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnGroupNoNotBetween(String value1, String value2) {
            addCriterion("FN_GROUP_NO not between", value1, value2, "fnGroupNo");
            return (Criteria) this;
        }

        public Criteria andFnNoIsNull() {
            addCriterion("FN_NO is null");
            return (Criteria) this;
        }

        public Criteria andFnNoIsNotNull() {
            addCriterion("FN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFnNoEqualTo(String value) {
            addCriterion("FN_NO =", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoNotEqualTo(String value) {
            addCriterion("FN_NO <>", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoGreaterThan(String value) {
            addCriterion("FN_NO >", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoGreaterThanOrEqualTo(String value) {
            addCriterion("FN_NO >=", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoLessThan(String value) {
            addCriterion("FN_NO <", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoLessThanOrEqualTo(String value) {
            addCriterion("FN_NO <=", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoLike(String value) {
            addCriterion("FN_NO like", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoNotLike(String value) {
            addCriterion("FN_NO not like", value, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoIn(List<String> values) {
            addCriterion("FN_NO in", values, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoNotIn(List<String> values) {
            addCriterion("FN_NO not in", values, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoBetween(String value1, String value2) {
            addCriterion("FN_NO between", value1, value2, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnNoNotBetween(String value1, String value2) {
            addCriterion("FN_NO not between", value1, value2, "fnNo");
            return (Criteria) this;
        }

        public Criteria andFnPathIsNull() {
            addCriterion("FN_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFnPathIsNotNull() {
            addCriterion("FN_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFnPathEqualTo(String value) {
            addCriterion("FN_PATH =", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathNotEqualTo(String value) {
            addCriterion("FN_PATH <>", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathGreaterThan(String value) {
            addCriterion("FN_PATH >", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathGreaterThanOrEqualTo(String value) {
            addCriterion("FN_PATH >=", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathLessThan(String value) {
            addCriterion("FN_PATH <", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathLessThanOrEqualTo(String value) {
            addCriterion("FN_PATH <=", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathLike(String value) {
            addCriterion("FN_PATH like", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathNotLike(String value) {
            addCriterion("FN_PATH not like", value, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathIn(List<String> values) {
            addCriterion("FN_PATH in", values, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathNotIn(List<String> values) {
            addCriterion("FN_PATH not in", values, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathBetween(String value1, String value2) {
            addCriterion("FN_PATH between", value1, value2, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnPathNotBetween(String value1, String value2) {
            addCriterion("FN_PATH not between", value1, value2, "fnPath");
            return (Criteria) this;
        }

        public Criteria andFnSortIsNull() {
            addCriterion("FN_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFnSortIsNotNull() {
            addCriterion("FN_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFnSortEqualTo(Short value) {
            addCriterion("FN_SORT =", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortNotEqualTo(Short value) {
            addCriterion("FN_SORT <>", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortGreaterThan(Short value) {
            addCriterion("FN_SORT >", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortGreaterThanOrEqualTo(Short value) {
            addCriterion("FN_SORT >=", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortLessThan(Short value) {
            addCriterion("FN_SORT <", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortLessThanOrEqualTo(Short value) {
            addCriterion("FN_SORT <=", value, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortIn(List<Short> values) {
            addCriterion("FN_SORT in", values, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortNotIn(List<Short> values) {
            addCriterion("FN_SORT not in", values, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortBetween(Short value1, Short value2) {
            addCriterion("FN_SORT between", value1, value2, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnSortNotBetween(Short value1, Short value2) {
            addCriterion("FN_SORT not between", value1, value2, "fnSort");
            return (Criteria) this;
        }

        public Criteria andFnDescIsNull() {
            addCriterion("FN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFnDescIsNotNull() {
            addCriterion("FN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFnDescEqualTo(String value) {
            addCriterion("FN_DESC =", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescNotEqualTo(String value) {
            addCriterion("FN_DESC <>", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescGreaterThan(String value) {
            addCriterion("FN_DESC >", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescGreaterThanOrEqualTo(String value) {
            addCriterion("FN_DESC >=", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescLessThan(String value) {
            addCriterion("FN_DESC <", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescLessThanOrEqualTo(String value) {
            addCriterion("FN_DESC <=", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescLike(String value) {
            addCriterion("FN_DESC like", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescNotLike(String value) {
            addCriterion("FN_DESC not like", value, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescIn(List<String> values) {
            addCriterion("FN_DESC in", values, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescNotIn(List<String> values) {
            addCriterion("FN_DESC not in", values, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescBetween(String value1, String value2) {
            addCriterion("FN_DESC between", value1, value2, "fnDesc");
            return (Criteria) this;
        }

        public Criteria andFnDescNotBetween(String value1, String value2) {
            addCriterion("FN_DESC not between", value1, value2, "fnDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}