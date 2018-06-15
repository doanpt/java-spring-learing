package com.dvt.samsung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvt.samsung.entity.TranDau;
import com.dvt.samsung.reponsitory.LichThiDauResponsitory;

@Service
public class LichThiDauService {
	@Autowired
	private LichThiDauResponsitory lichThiDauRepository;

	public Iterable<TranDau> findAllLichThiDau() {
		return lichThiDauRepository.findAll();
	}

	public TranDau findOne(int id) {
		return lichThiDauRepository.findOne(id);
	}

	public void save(TranDau tranDau) {
		lichThiDauRepository.save(tranDau);
	}

	public void delete(int id) {
		lichThiDauRepository.delete(id);
	}
}
