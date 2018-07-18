package com.jonathan.change;

import com.jonathan.time.DateTime;

import java.util.ArrayList;

public class Change {

    /**
     * Used to store the Date and Time at which the Change occurred
     */
    private DateTime dateTime;

    /**
     * Title or basic description of the Change
     */
    private String title;

    /**
     * ArrayList containing all of the Change's ChangeProcedures
     */
    private ArrayList<ChangeProcedure> changeProcedureArrayList;

    /**
     * Default Constructor
     * Simply initializes all members using their resepective default constructors
     */
    public Change() {
        this.setDateTime(new DateTime());
        this.setTitle("");
        this.setChangeProcedureArrayList(new ArrayList<ChangeProcedure>());
    }

    /**
     * Basic Constructor
     * Simply sets the members to the parameters passed respectively
     * @param dateTime the DateTime to be used as inner dateTime
     * @param title the String to be used as inner title
     * @param changeProcedureArrayList the ArrayList to be used as inner changeProcedureArrayList
     */
    public Change(DateTime dateTime, String title, ArrayList<ChangeProcedure> changeProcedureArrayList) {
        this.setDateTime(dateTime);
        this.setTitle(title);
        this.setChangeProcedureArrayList(changeProcedureArrayList);
    }

    /**
     * Takes the Procedure parameter passed and adds it to the inner changeProcedureArrayList
     * using the ArrayList.add() method
     * @param procedure the ChangeProcedure which is to be added to the inner changeProcedureArrayList
     */
    public void addProcedure(ChangeProcedure procedure) {
        this.getChangeProcedureArrayList().add(procedure);
    }

    /**
     * Takes the Procedure parameter passed and attempts to remove it from the inner changeProcedureArrayList
     * using the ArrayList.remove(Object o) method
     * @param procedure the ChangeProcedure which will be removed from list if it exists
     * @return whether or not the ChangeProcedure existed and hence removed from the inner changeProcedureArrayList
     */
    public boolean removeProcedure(ChangeProcedure procedure) {
        return this.getChangeProcedureArrayList().remove(procedure);
    }

    /*
    Getters and Setters
     */


    /**
     * Basic getter for dateTime, simply returns dateTime
     * @return the dateTime
     */
    public DateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Basic setter for the dateTime, simply sets the dateTime to the parameter passed
     * @param dateTime the DateTime to be used as inner dateTime
     */
    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Basic getter for dateTime, simply returns dateTime
     * @return the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Basic setter for the title, simply sets the title to the parameter passed
     * @param title the String to be used as inner title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Basic getter for changeProcedureArrayList, simply returns changeProcedureArrayList
     * @return the changeProcedureArrayList
     */
    public ArrayList<ChangeProcedure> getChangeProcedureArrayList() {
        return this.changeProcedureArrayList;
    }

    /**
     * Basic setter for the changeProcedureArrayList, simply sets the changeProcedureArrayList to the parameter passed
     * @param changeProcedureArrayList the ArrayList to be used as inner changeProcedureArrayList
     */
    public void setChangeProcedureArrayList(ArrayList<ChangeProcedure> changeProcedureArrayList) {
        this.changeProcedureArrayList = changeProcedureArrayList;
    }
}
