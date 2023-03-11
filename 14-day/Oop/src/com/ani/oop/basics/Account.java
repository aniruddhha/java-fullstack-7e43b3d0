package com.ani.oop.basics;

public class Account {

    private int acId;
    private String acNm;
    private boolean isActive;
    protected String branch;
    
    public Account() {
        
    }

    public Account(int acId, String acNm, boolean isActive) {
        this.acId = acId;
        this.acNm = acNm;
        this.isActive = isActive;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + acId;
        result = prime * result + ((acNm == null) ? 0 : acNm.hashCode());
        result = prime * result + (isActive ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Account other = (Account) obj;
        if (acId != other.acId)
            return false;
        if (acNm == null) {
            if (other.acNm != null)
                return false;
        } else if (!acNm.equals(other.acNm))
            return false;
        if (isActive != other.isActive)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Account [acId=" + acId + ", acNm=" + acNm + ", isActive=" + isActive + "]";
    }

    public void activateAccount() {

    }
}
