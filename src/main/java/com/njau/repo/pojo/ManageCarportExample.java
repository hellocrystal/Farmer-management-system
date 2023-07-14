package com.njau.repo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManageCarportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageCarportExample() {
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

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(String value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(String value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(String value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(String value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(String value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLike(String value) {
            addCriterion("zone_id like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotLike(String value) {
            addCriterion("zone_id not like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<String> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<String> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(String value1, String value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(String value1, String value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andCarportIdIsNull() {
            addCriterion("carport_id is null");
            return (Criteria) this;
        }

        public Criteria andCarportIdIsNotNull() {
            addCriterion("carport_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarportIdEqualTo(Integer value) {
            addCriterion("carport_id =", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotEqualTo(Integer value) {
            addCriterion("carport_id <>", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdGreaterThan(Integer value) {
            addCriterion("carport_id >", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carport_id >=", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdLessThan(Integer value) {
            addCriterion("carport_id <", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdLessThanOrEqualTo(Integer value) {
            addCriterion("carport_id <=", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdIn(List<Integer> values) {
            addCriterion("carport_id in", values, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotIn(List<Integer> values) {
            addCriterion("carport_id not in", values, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdBetween(Integer value1, Integer value2) {
            addCriterion("carport_id between", value1, value2, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carport_id not between", value1, value2, "carportId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("`result` is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("`result` is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Byte value) {
            addCriterion("`result` =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Byte value) {
            addCriterion("`result` <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Byte value) {
            addCriterion("`result` >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("`result` >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Byte value) {
            addCriterion("`result` <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Byte value) {
            addCriterion("`result` <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Byte> values) {
            addCriterion("`result` in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Byte> values) {
            addCriterion("`result` not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Byte value1, Byte value2) {
            addCriterion("`result` between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Byte value1, Byte value2) {
            addCriterion("`result` not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIsNull() {
            addCriterion("staff_username is null");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIsNotNull() {
            addCriterion("staff_username is not null");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameEqualTo(String value) {
            addCriterion("staff_username =", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotEqualTo(String value) {
            addCriterion("staff_username <>", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameGreaterThan(String value) {
            addCriterion("staff_username >", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_username >=", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLessThan(String value) {
            addCriterion("staff_username <", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLessThanOrEqualTo(String value) {
            addCriterion("staff_username <=", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLike(String value) {
            addCriterion("staff_username like", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotLike(String value) {
            addCriterion("staff_username not like", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIn(List<String> values) {
            addCriterion("staff_username in", values, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotIn(List<String> values) {
            addCriterion("staff_username not in", values, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameBetween(String value1, String value2) {
            addCriterion("staff_username between", value1, value2, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotBetween(String value1, String value2) {
            addCriterion("staff_username not between", value1, value2, "staffUsername");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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