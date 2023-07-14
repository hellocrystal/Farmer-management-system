package com.njau.repo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDnoIsNull() {
            addCriterion("dno is null");
            return (Criteria) this;
        }

        public Criteria andDnoIsNotNull() {
            addCriterion("dno is not null");
            return (Criteria) this;
        }

        public Criteria andDnoEqualTo(Integer value) {
            addCriterion("dno =", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotEqualTo(Integer value) {
            addCriterion("dno <>", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThan(Integer value) {
            addCriterion("dno >", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dno >=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThan(Integer value) {
            addCriterion("dno <", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoLessThanOrEqualTo(Integer value) {
            addCriterion("dno <=", value, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoIn(List<Integer> values) {
            addCriterion("dno in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotIn(List<Integer> values) {
            addCriterion("dno not in", values, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoBetween(Integer value1, Integer value2) {
            addCriterion("dno between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andDnoNotBetween(Integer value1, Integer value2) {
            addCriterion("dno not between", value1, value2, "dno");
            return (Criteria) this;
        }

        public Criteria andOfficetimeIsNull() {
            addCriterion("officeTime is null");
            return (Criteria) this;
        }

        public Criteria andOfficetimeIsNotNull() {
            addCriterion("officeTime is not null");
            return (Criteria) this;
        }

        public Criteria andOfficetimeEqualTo(Date value) {
            addCriterionForJDBCTime("officeTime =", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("officeTime <>", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("officeTime >", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("officeTime >=", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeLessThan(Date value) {
            addCriterionForJDBCTime("officeTime <", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("officeTime <=", value, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeIn(List<Date> values) {
            addCriterionForJDBCTime("officeTime in", values, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("officeTime not in", values, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("officeTime between", value1, value2, "officetime");
            return (Criteria) this;
        }

        public Criteria andOfficetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("officeTime not between", value1, value2, "officetime");
            return (Criteria) this;
        }

        public Criteria andQuittimeIsNull() {
            addCriterion("quitTime is null");
            return (Criteria) this;
        }

        public Criteria andQuittimeIsNotNull() {
            addCriterion("quitTime is not null");
            return (Criteria) this;
        }

        public Criteria andQuittimeEqualTo(Date value) {
            addCriterionForJDBCTime("quitTime =", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("quitTime <>", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeGreaterThan(Date value) {
            addCriterionForJDBCTime("quitTime >", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("quitTime >=", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeLessThan(Date value) {
            addCriterionForJDBCTime("quitTime <", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("quitTime <=", value, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeIn(List<Date> values) {
            addCriterionForJDBCTime("quitTime in", values, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("quitTime not in", values, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("quitTime between", value1, value2, "quittime");
            return (Criteria) this;
        }

        public Criteria andQuittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("quitTime not between", value1, value2, "quittime");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(Integer value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(Integer value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(Integer value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(Integer value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(Integer value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<Integer> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<Integer> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(Integer value1, Integer value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
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