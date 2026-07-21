package com.vanshrajput.repo;

import com.vanshrajput.models.Account;
import com.vanshrajput.models.Profile;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;
import java.util.List;

public interface AccountRepo {
    Account findUser(String userId);

    boolean save(Account account);

    boolean checkForEmail(String email);

    boolean checkForId(String id);

    List<Account> findProfiles(String query);

    List<Account> getAccountsForFriends(Integer a);

    void update(Account account);

    void merge(Account account);
}
