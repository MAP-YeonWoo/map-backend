public class Mission {

    private Long missionId;
    private String condition;
    private Store store;

    public Mission(Long missionId, String condition, Store store) {
        this.missionId = missionId;
        this.condition = condition;
        this.store = store;
    }

    public Long getMissionId() {
        return missionId;
    }

    public String getCondition() {
        return condition;
    }

    public Store getStore() {
        return store;
    }
}