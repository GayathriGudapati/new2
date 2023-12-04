package org.jsp.merchantproductapp.repository;

import org.jsp.merchantproductapp.dto.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {

}
