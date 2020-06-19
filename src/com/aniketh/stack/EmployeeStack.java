package com.aniketh.stack;

public class EmployeeStack {
    private String firstName;
    private String lastName;
    private int id;

    public EmployeeStack(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            EmployeeStack employeeStack = (EmployeeStack)o;
            if (this.id != employeeStack.id) {
                return false;
            } else {
                return !this.firstName.equals(employeeStack.firstName) ? false : this.lastName.equals(employeeStack.lastName);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.firstName.hashCode();
        result = 31 * result + this.lastName.hashCode();
        result = 31 * result + this.id;
        return result;
    }

    public String toString() {
        return "Employee{firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", id=" + this.id + '}';
    }
}
