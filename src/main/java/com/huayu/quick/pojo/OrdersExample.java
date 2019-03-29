package com.huayu.quick.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andReqaddressIsNull() {
            addCriterion("reqAddress is null");
            return (Criteria) this;
        }

        public Criteria andReqaddressIsNotNull() {
            addCriterion("reqAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReqaddressEqualTo(String value) {
            addCriterion("reqAddress =", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressNotEqualTo(String value) {
            addCriterion("reqAddress <>", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressGreaterThan(String value) {
            addCriterion("reqAddress >", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressGreaterThanOrEqualTo(String value) {
            addCriterion("reqAddress >=", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressLessThan(String value) {
            addCriterion("reqAddress <", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressLessThanOrEqualTo(String value) {
            addCriterion("reqAddress <=", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressLike(String value) {
            addCriterion("reqAddress like", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressNotLike(String value) {
            addCriterion("reqAddress not like", value, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressIn(List<String> values) {
            addCriterion("reqAddress in", values, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressNotIn(List<String> values) {
            addCriterion("reqAddress not in", values, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressBetween(String value1, String value2) {
            addCriterion("reqAddress between", value1, value2, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andReqaddressNotBetween(String value1, String value2) {
            addCriterion("reqAddress not between", value1, value2, "reqaddress");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carId =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carId <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carId >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carId >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carId <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carId <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carId in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carId not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carId between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carId not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andSeridIsNull() {
            addCriterion("serId is null");
            return (Criteria) this;
        }

        public Criteria andSeridIsNotNull() {
            addCriterion("serId is not null");
            return (Criteria) this;
        }

        public Criteria andSeridEqualTo(Integer value) {
            addCriterion("serId =", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotEqualTo(Integer value) {
            addCriterion("serId <>", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThan(Integer value) {
            addCriterion("serId >", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("serId >=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThan(Integer value) {
            addCriterion("serId <", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThanOrEqualTo(Integer value) {
            addCriterion("serId <=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridIn(List<Integer> values) {
            addCriterion("serId in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotIn(List<Integer> values) {
            addCriterion("serId not in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridBetween(Integer value1, Integer value2) {
            addCriterion("serId between", value1, value2, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotBetween(Integer value1, Integer value2) {
            addCriterion("serId not between", value1, value2, "serid");
            return (Criteria) this;
        }

        public Criteria andOmidIsNull() {
            addCriterion("omid is null");
            return (Criteria) this;
        }

        public Criteria andOmidIsNotNull() {
            addCriterion("omid is not null");
            return (Criteria) this;
        }

        public Criteria andOmidEqualTo(Integer value) {
            addCriterion("omid =", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidNotEqualTo(Integer value) {
            addCriterion("omid <>", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidGreaterThan(Integer value) {
            addCriterion("omid >", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("omid >=", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidLessThan(Integer value) {
            addCriterion("omid <", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidLessThanOrEqualTo(Integer value) {
            addCriterion("omid <=", value, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidIn(List<Integer> values) {
            addCriterion("omid in", values, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidNotIn(List<Integer> values) {
            addCriterion("omid not in", values, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidBetween(Integer value1, Integer value2) {
            addCriterion("omid between", value1, value2, "omid");
            return (Criteria) this;
        }

        public Criteria andOmidNotBetween(Integer value1, Integer value2) {
            addCriterion("omid not between", value1, value2, "omid");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("otime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("otime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("otime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("otime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("otime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("otime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("otime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("otime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("otime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("otime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("otime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("otime not between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOjtimeIsNull() {
            addCriterion("ojTime is null");
            return (Criteria) this;
        }

        public Criteria andOjtimeIsNotNull() {
            addCriterion("ojTime is not null");
            return (Criteria) this;
        }

        public Criteria andOjtimeEqualTo(Date value) {
            addCriterion("ojTime =", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeNotEqualTo(Date value) {
            addCriterion("ojTime <>", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeGreaterThan(Date value) {
            addCriterion("ojTime >", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ojTime >=", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeLessThan(Date value) {
            addCriterion("ojTime <", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeLessThanOrEqualTo(Date value) {
            addCriterion("ojTime <=", value, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeIn(List<Date> values) {
            addCriterion("ojTime in", values, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeNotIn(List<Date> values) {
            addCriterion("ojTime not in", values, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeBetween(Date value1, Date value2) {
            addCriterion("ojTime between", value1, value2, "ojtime");
            return (Criteria) this;
        }

        public Criteria andOjtimeNotBetween(Date value1, Date value2) {
            addCriterion("ojTime not between", value1, value2, "ojtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("orderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("orderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("orderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("orderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("orderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("orderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("orderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("orderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("orderType like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("orderType not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("orderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("orderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("orderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("orderType not between", value1, value2, "ordertype");
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