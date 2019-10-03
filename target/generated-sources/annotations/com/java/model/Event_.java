package com.java.model;

import java.time.Duration;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ extends com.java.model.AbstractEntity_ {

	public static volatile SingularAttribute<Event, Duration> duration;
	public static volatile SingularAttribute<Event, LocalDateTime> dateOfEvent;
	public static volatile SingularAttribute<Event, String> name;
	public static volatile SingularAttribute<Event, Long> id;

	public static final String DURATION = "duration";
	public static final String DATE_OF_EVENT = "dateOfEvent";
	public static final String NAME = "name";
	public static final String ID = "id";

}

