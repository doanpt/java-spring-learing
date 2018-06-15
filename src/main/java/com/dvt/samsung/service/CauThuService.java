package com.dvt.samsung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvt.samsung.entity.CauThu;
import com.dvt.samsung.reponsitory.CauThuResponsitory;

@Service
public class CauThuService {
	@Autowired
	private CauThuResponsitory cauThuResponsitory;

	public Iterable<CauThu> findAllCauThu() {
		return cauThuResponsitory.findAll();
	}

	public CauThu findOne(int id) {
		return cauThuResponsitory.findOne(id);
	}

	public void save(CauThu cauThu) {
		cauThuResponsitory.save(cauThu);
	}

	public void delete(int id) {
		cauThuResponsitory.delete(id);
	}
}
