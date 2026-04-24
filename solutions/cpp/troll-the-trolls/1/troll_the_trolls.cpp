namespace hellmath {

enum class AccountStatus {
    troll,
    guest,
    user,
    mod
};

enum class Action {
    read,
    write,
    remove
};

bool display_post(AccountStatus poster, AccountStatus viewer) {
    if (poster == AccountStatus::troll && viewer != AccountStatus::troll) return false;
    //if (poster != AccountStatus::troll && viewer == AccountStatus::troll) return false;
    return true;
}

bool permission_check(Action action, AccountStatus status) {
    switch (status) {
        case AccountStatus::guest:
            return action == Action::read;
        case AccountStatus::troll:
        case AccountStatus::user:
            return action == Action::read || action == Action::write;
        case AccountStatus::mod:
            return true;
        default:
            return false;
    }
}

bool valid_player_combination(AccountStatus p1, AccountStatus p2) {
    if (p1 == AccountStatus::guest || p2 == AccountStatus::guest) return false;
    if ((p1 == AccountStatus::troll) != (p2 == AccountStatus::troll)) return false;
    return true;
}

bool has_priority(AccountStatus first, AccountStatus second) {
    // Atribuim valori numerice pentru a compara prioritatea usor
    // Mod (3) > User (2) > Guest (1) > Troll (0)
    auto get_val = [](AccountStatus s) {
        if (s == AccountStatus::mod) return 3;
        if (s == AccountStatus::user) return 2;
        if (s == AccountStatus::guest) return 1;
        return 0;
    };
    
    return get_val(first) > get_val(second);
}

} 