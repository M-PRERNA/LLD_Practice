package com.learn.spring.lld.creational.prototype;


public interface UserPrototypeRegistry {
    
// --Commented out by Inspection START (01-06-2026 21:51):
//    // --Commented out by Inspection (01-06-2026 21:51):void addPrototype(User user);
//
//    User getPrototype(UserType type);
// --Commented out by Inspection STOP (01-06-2026 21:51)

    User clone(UserType type);
}