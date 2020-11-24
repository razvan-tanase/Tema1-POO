package actions;

import fileio.ActionInputData;

public class Action {
    /**
     * Action id
     */
    private final int  actionId;
    /**
     * Type of action
     */
    private final String actionType;

    public Action(ActionInputData actions) {
        this.actionId = actions.getActionId();
        this.actionType = actions.getActionType();
    }

    public int getActionId() {
        return actionId;
    }

    public String getActionType() {
        return actionType;
    }
}
