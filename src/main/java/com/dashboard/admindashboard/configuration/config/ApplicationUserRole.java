package com.dashboard.admindashboard.configuration.config;


import com.google.common.collect.Sets;

import java.util.Set;

import static com.dashboard.admindashboard.configuration.config.ApplicationUserPermission.USER_READ;
import static com.dashboard.admindashboard.configuration.config.ApplicationUserPermission.USER_WRITE;

public enum ApplicationUserRole {
    USER(Sets.newHashSet()),
    ADMIN_TRAINEE(Sets.newHashSet(USER_READ)),
    ADMIN(Sets.newHashSet(USER_WRITE, USER_READ));


    private final Set<ApplicationUserPermission> permissions;
    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
