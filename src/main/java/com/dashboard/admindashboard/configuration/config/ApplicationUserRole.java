package com.dashboard.admindashboard.configuration.config;


import java.util.Set;

public enum ApplicationUserRole {
    USER(Sets.)

    private final Set<ApplicationUserPermission> permissions;
    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
