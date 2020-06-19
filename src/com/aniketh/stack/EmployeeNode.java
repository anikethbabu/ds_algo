package com.aniketh.stack;

import com.aniketh.EmployeeStack;

public class EmployeeNode {
        private EmployeeStack employeeStack;
        private EmployeeNode next;
        private EmployeeNode previous;

        public EmployeeNode(EmployeeStack employeeStack) {
            this.employeeStack = employeeStack;
        }

        public EmployeeStack getEmployee() {
            return this.employeeStack;
        }

        public void setEmployee(EmployeeStack employeeStack) {
            this.employeeStack = employeeStack;
        }

        public EmployeeNode getNext() {
            return this.next;
        }

        public void setNext(EmployeeNode next) {
            this.next = next;
        }

        public EmployeeNode getPrevious() {
            return this.previous;
        }

        public void setPrevious(EmployeeNode previous) {
            this.previous = previous;
        }

        public String toString() {
            return this.employeeStack.toString();
        }

}
