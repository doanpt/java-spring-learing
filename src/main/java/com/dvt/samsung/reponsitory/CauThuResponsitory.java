package com.dvt.samsung.reponsitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dvt.samsung.entity.CauThu;

@Repository
public interface CauThuResponsitory extends CrudRepository<CauThu, Integer> {

}
