package com.dvt.samsung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dvt.samsung.entity.TranDau;
import com.dvt.samsung.service.LichThiDauService;

@RestController
@RequestMapping("/lichthidau")
public class LichThiDauController {
	@Autowired
	private LichThiDauService lichThiDauService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<TranDau> findAllLichThiDau() {
		return (List<TranDau>) lichThiDauService.findAllLichThiDau();
	}

	@RequestMapping("/get/{id}")
	public TranDau findOneTranDau(@PathVariable Integer id) {
		return lichThiDauService.findOne(id);
	}

	@PostMapping("/add")
	public TranDau addTranDau(@RequestBody TranDau tranDau) {
		lichThiDauService.save(tranDau);
		return tranDau;
	}

	@DeleteMapping("/delete/{id}")
	public void deleteLichThiDau(@PathVariable Integer id) {
		lichThiDauService.delete(id);
	}

	@PutMapping("/update/")
	public TranDau updateLichThiDau(@RequestBody TranDau tranDau) {
		TranDau temp = lichThiDauService.findOne(tranDau.getId());
		if (temp != null) {
			System.out.println("update id:: " + temp.getId());
			lichThiDauService.save(tranDau);
		} else {
			System.out.println("Not exsit id! ");
		}
		return tranDau;
	}

	@PostMapping("/insert/")
	public TranDau insertLichThiDau(@RequestBody TranDau tranDau) {
		lichThiDauService.save(tranDau);
		return tranDau;
	}
}
