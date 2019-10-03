package com.java.backend;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class BasicApplicationException extends Exception {

    public static String ENTITY_EXISTS_EXCEPTION = "messages.excep.entityexistsexception";
    public static String ENTITY_NOT_FOUND_EXCEPTION = "messages.excep.entitynotfoundexception";
    public static String NO_RESULT_EXCEPTION = "messages.excep.noresultexception";
    public static String TRANSACTION_REQUIRED_EXCEPTION = "messages.excep.transactionrequiredexception";
    public static String OPTIMISTIC_LOCK_EXCEPTION = "messages.excep.optimisticlockexception";

    static final long serialVersionUID = 10L;

    public BasicApplicationException() {
    }

    public BasicApplicationException(String message) {
        super(message);
    }

    public BasicApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasicApplicationException(Throwable cause) {
        super(cause);
    }

}
