package com.valid.valid.group_validate;

import javax.validation.GroupSequence;

@GroupSequence({Person.GroupA.class, Person.GroupB.class})
public interface GroupOrder {
}
