package com.java.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    protected static final long serialVersionUID = 1L;

    protected abstract Object getId();

    protected abstract Object getBusinessKey();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[id=" + getId() + ", key=" + getBusinessKey() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }

        if (this.getClass().isAssignableFrom(obj.getClass())) {
            return this.getBusinessKey().equals(((AbstractEntity) obj).getBusinessKey());
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return getBusinessKey().hashCode();
    }
}
