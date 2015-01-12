package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParSellReturnTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParSellReturnTypeExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andReturnTypeIdIsNull() {
            addCriterion("temp_par_sell_return_type.return_type_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdIsNotNull() {
            addCriterion("temp_par_sell_return_type.return_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id =", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id <>", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id >", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id >=", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdLessThan(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id <", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id <=", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdLike(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id like", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdNotLike(String value) {
            addCriterion("temp_par_sell_return_type.return_type_id not like", value, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.return_type_id in", values, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.return_type_id not in", values, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.return_type_id between", value1, value2, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.return_type_id not between", value1, value2, "returnTypeId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("temp_par_sell_return_type.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("temp_par_sell_return_type.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("temp_par_sell_return_type.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("temp_par_sell_return_type.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("temp_par_sell_return_type.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameIsNull() {
            addCriterion("temp_par_sell_return_type.return_type_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameIsNotNull() {
            addCriterion("temp_par_sell_return_type.return_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name =", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name <>", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name >", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name >=", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameLessThan(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name <", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name <=", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameLike(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name like", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameNotLike(String value) {
            addCriterion("temp_par_sell_return_type.return_type_name not like", value, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.return_type_name in", values, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.return_type_name not in", values, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.return_type_name between", value1, value2, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.return_type_name not between", value1, value2, "returnTypeName");
            return (Criteria) this;
        }

        public Criteria andSequencedIsNull() {
            addCriterion("temp_par_sell_return_type.sequenced is null");
            return (Criteria) this;
        }

        public Criteria andSequencedIsNotNull() {
            addCriterion("temp_par_sell_return_type.sequenced is not null");
            return (Criteria) this;
        }

        public Criteria andSequencedEqualTo(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced =", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedNotEqualTo(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced <>", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedGreaterThan(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced >", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced >=", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedLessThan(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced <", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedLessThanOrEqualTo(Integer value) {
            addCriterion("temp_par_sell_return_type.sequenced <=", value, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedIn(List<Integer> values) {
            addCriterion("temp_par_sell_return_type.sequenced in", values, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedNotIn(List<Integer> values) {
            addCriterion("temp_par_sell_return_type.sequenced not in", values, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedBetween(Integer value1, Integer value2) {
            addCriterion("temp_par_sell_return_type.sequenced between", value1, value2, "sequenced");
            return (Criteria) this;
        }

        public Criteria andSequencedNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_par_sell_return_type.sequenced not between", value1, value2, "sequenced");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_sell_return_type.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_sell_return_type.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_sell_return_type.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_sell_return_type.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_sell_return_type.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_sell_return_type.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_sell_return_type.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_sell_return_type.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_sell_return_type.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_sell_return_type.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_sell_return_type.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_sell_return_type.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_sell_return_type.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_sell_return_type.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_sell_return_type.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_sell_return_type.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_sell_return_type.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_sell_return_type.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_sell_return_type.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_sell_return_type.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_sell_return_type.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_sell_return_type.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_sell_return_type.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_sell_return_type.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_sell_return_type.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_sell_return_type.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_sell_return_type.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_sell_return_type.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_sell_return_type.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_sell_return_type.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_sell_return_type.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_sell_return_type.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_sell_return_type.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_sell_return_type.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_sell_return_type.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_sell_return_type.update_time not between", value1, value2, "updateTime");
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