package com.jonathan.change;

import java.util.ArrayList;

/**
 * Represents a log which may contain basic information about the system,
 * as well as a list of Change's
 */
public class ChangeLog {

    /**
     * ArrayList used to store all the changes within the log
     */
    private ArrayList<Change> changeArrayList;

    /**
     * Default Constructor
     * Simply initializes the changeArrayList using ArrayList default constructor
     */
    public ChangeLog() {
        this.setChangeArrayList(new ArrayList<Change>());
    }

    /**
     * Basic Constructor
     * Simply sets the inner changeArrayList to the parameter passed
     * @param changeArrayList the ArrayList to be used as changeArrayList within object
     */
    public ChangeLog(ArrayList<Change> changeArrayList) {
        this.setChangeArrayList(changeArrayList);
    }

    /**
     * Takes the Change parameter passed and adds it to the inner changeArrayList
     * using the ArrayList.add() method
     * @param change the Change which is to be added to the inner changeArrayList
     */
    public void addChange(Change change) {
        this.getChangeArrayList().add(change);
    }

    /**
     * Takes the Change parameter passed and attempts to remove it from the inner changeArrayList
     * using the ArrayList.remove(Object o) method
     * @param change the Change which will be removed from list if it exists
     * @return whether or not the Change existed and hence removed from the inner changeArrayList
     */
    public boolean removeChange(Change change) {
        return this.getChangeArrayList().remove(change);
    }


    /*
    Getters and Setters
     */

    /**
     * Basic getter for changeArrayList, simply returns changeArrayList
     * @return the changeArrayList
     */
    public ArrayList<Change> getChangeArrayList() {
        return this.changeArrayList;
    }

    /**
     * Basic setter for the changeArrayList, simply sets the changeArrayList to the parameter passed
     * @param changeArrayList the ArrayList to be used as inner changeArrayList
     */
    public void setChangeArrayList(ArrayList<Change> changeArrayList) {
        this.changeArrayList = changeArrayList;
    }
}
