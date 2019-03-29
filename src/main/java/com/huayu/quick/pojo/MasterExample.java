package com.huayu.quick.pojo;

import java.util.ArrayList;
import java.util.List;

public class MasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MasterExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMasnameIsNull() {
            addCriterion("masName is null");
            return (Criteria) this;
        }

        public Criteria andMasnameIsNotNull() {
            addCriterion("masName is not null");
            return (Criteria) this;
        }

        public Criteria andMasnameEqualTo(String value) {
            addCriterion("masName =", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameNotEqualTo(String value) {
            addCriterion("masName <>", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameGreaterThan(String value) {
            addCriterion("masName >", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameGreaterThanOrEqualTo(String value) {
            addCriterion("masName >=", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameLessThan(String value) {
            addCriterion("masName <", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameLessThanOrEqualTo(String value) {
            addCriterion("masName <=", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameLike(String value) {
            addCriterion("masName like", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameNotLike(String value) {
            addCriterion("masName not like", value, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameIn(List<String> values) {
            addCriterion("masName in", values, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameNotIn(List<String> values) {
            addCriterion("masName not in", values, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameBetween(String value1, String value2) {
            addCriterion("masName between", value1, value2, "masname");
            return (Criteria) this;
        }

        public Criteria andMasnameNotBetween(String value1, String value2) {
            addCriterion("masName not between", value1, value2, "masname");
            return (Criteria) this;
        }

        public Criteria andMaspasswordIsNull() {
            addCriterion("masPassword is null");
            return (Criteria) this;
        }

        public Criteria andMaspasswordIsNotNull() {
            addCriterion("masPassword is not null");
            return (Criteria) this;
        }

        public Criteria andMaspasswordEqualTo(String value) {
            addCriterion("masPassword =", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordNotEqualTo(String value) {
            addCriterion("masPassword <>", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordGreaterThan(String value) {
            addCriterion("masPassword >", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordGreaterThanOrEqualTo(String value) {
            addCriterion("masPassword >=", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordLessThan(String value) {
            addCriterion("masPassword <", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordLessThanOrEqualTo(String value) {
            addCriterion("masPassword <=", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordLike(String value) {
            addCriterion("masPassword like", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordNotLike(String value) {
            addCriterion("masPassword not like", value, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordIn(List<String> values) {
            addCriterion("masPassword in", values, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordNotIn(List<String> values) {
            addCriterion("masPassword not in", values, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordBetween(String value1, String value2) {
            addCriterion("masPassword between", value1, value2, "maspassword");
            return (Criteria) this;
        }

        public Criteria andMaspasswordNotBetween(String value1, String value2) {
            addCriterion("masPassword not between", value1, value2, "maspassword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMasphoneIsNull() {
            addCriterion("masPhone is null");
            return (Criteria) this;
        }

        public Criteria andMasphoneIsNotNull() {
            addCriterion("masPhone is not null");
            return (Criteria) this;
        }

        public Criteria andMasphoneEqualTo(Integer value) {
            addCriterion("masPhone =", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneNotEqualTo(Integer value) {
            addCriterion("masPhone <>", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneGreaterThan(Integer value) {
            addCriterion("masPhone >", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("masPhone >=", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneLessThan(Integer value) {
            addCriterion("masPhone <", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneLessThanOrEqualTo(Integer value) {
            addCriterion("masPhone <=", value, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneIn(List<Integer> values) {
            addCriterion("masPhone in", values, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneNotIn(List<Integer> values) {
            addCriterion("masPhone not in", values, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneBetween(Integer value1, Integer value2) {
            addCriterion("masPhone between", value1, value2, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("masPhone not between", value1, value2, "masphone");
            return (Criteria) this;
        }

        public Criteria andMasaddressIsNull() {
            addCriterion("masAddress is null");
            return (Criteria) this;
        }

        public Criteria andMasaddressIsNotNull() {
            addCriterion("masAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMasaddressEqualTo(String value) {
            addCriterion("masAddress =", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressNotEqualTo(String value) {
            addCriterion("masAddress <>", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressGreaterThan(String value) {
            addCriterion("masAddress >", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressGreaterThanOrEqualTo(String value) {
            addCriterion("masAddress >=", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressLessThan(String value) {
            addCriterion("masAddress <", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressLessThanOrEqualTo(String value) {
            addCriterion("masAddress <=", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressLike(String value) {
            addCriterion("masAddress like", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressNotLike(String value) {
            addCriterion("masAddress not like", value, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressIn(List<String> values) {
            addCriterion("masAddress in", values, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressNotIn(List<String> values) {
            addCriterion("masAddress not in", values, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressBetween(String value1, String value2) {
            addCriterion("masAddress between", value1, value2, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMasaddressNotBetween(String value1, String value2) {
            addCriterion("masAddress not between", value1, value2, "masaddress");
            return (Criteria) this;
        }

        public Criteria andMastypeIsNull() {
            addCriterion("masType is null");
            return (Criteria) this;
        }

        public Criteria andMastypeIsNotNull() {
            addCriterion("masType is not null");
            return (Criteria) this;
        }

        public Criteria andMastypeEqualTo(String value) {
            addCriterion("masType =", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeNotEqualTo(String value) {
            addCriterion("masType <>", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeGreaterThan(String value) {
            addCriterion("masType >", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeGreaterThanOrEqualTo(String value) {
            addCriterion("masType >=", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeLessThan(String value) {
            addCriterion("masType <", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeLessThanOrEqualTo(String value) {
            addCriterion("masType <=", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeLike(String value) {
            addCriterion("masType like", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeNotLike(String value) {
            addCriterion("masType not like", value, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeIn(List<String> values) {
            addCriterion("masType in", values, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeNotIn(List<String> values) {
            addCriterion("masType not in", values, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeBetween(String value1, String value2) {
            addCriterion("masType between", value1, value2, "mastype");
            return (Criteria) this;
        }

        public Criteria andMastypeNotBetween(String value1, String value2) {
            addCriterion("masType not between", value1, value2, "mastype");
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