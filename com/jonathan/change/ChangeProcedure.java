package com.jonathan.change;

import java.util.ArrayList;

public class ChangeProcedure {

    /**
     * Title or basic description of the ChangeProcedure
     */
    private String title;

    /**
     * Actual content of the Procedure, a detailed step that describes the procedure
     */
    private String content;

    /**
     * Reference to the parent ChangeProcedure, null implies none, i.e. it is a parent
     */
    private ChangeProcedure parentChangeProcedure;

    /**
     * ArrayList containing all of the ChangeProcedure's children ChangeProcedures
     */
    private ArrayList<ChangeProcedure> childChangeProcedureArrayList;

    /**
     * Default Constructor
     * Initializes almost all members using their respective default contructors
     * Sets the parentChangeProcedure to null by default
     */
    public ChangeProcedure() {
        this.setTitle("");
        this.setContent("");
        this.setParentChangeProcedure(null);
        this.setChildChangeProcedureArrayList(new ArrayList<ChangeProcedure>());
    }

    /**
     * Basic Constructor
     * Simply sets the members to the parameters passed respectively
     *
     */
    public ChangeProcedure(String title, ChangeProcedure parentChangeProcedure, ArrayList<ChangeProcedure> childChangeProcedureArrayList) {
        this.setTitle(title);
        this.setContent("");
        this.setParentChangeProcedure(parentChangeProcedure);
        this.setChildChangeProcedureArrayList(childChangeProcedureArrayList);
    }


    /*
    Getters and Setters
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ChangeProcedure getParentChangeProcedure() {
        return parentChangeProcedure;
    }

    public void setParentChangeProcedure(ChangeProcedure parentChangeProcedure) {
        this.parentChangeProcedure = parentChangeProcedure;
    }

    public ArrayList<ChangeProcedure> getChildChangeProcedureArrayList() {
        return childChangeProcedureArrayList;
    }

    public void setChildChangeProcedureArrayList(ArrayList<ChangeProcedure> childChangeProcedureArrayList) {
        this.childChangeProcedureArrayList = childChangeProcedureArrayList;
    }
}
