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

import com.dvt.samsung.entity.CauThu;
import com.dvt.samsung.service.CauThuService;

@RestController
@RequestMapping("/cauthu")
public class CauThuController {
	@Autowired
	private CauThuService cauThuService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<CauThu> findAllLichThiDau() {
		return (List<CauThu>) cauThuService.findAllCauThu();
	}

	@RequestMapping("/get/{id}")
	public CauThu findOneCauThu(@PathVariable Integer id) {
		return cauThuService.findOne(id);
	}

	@PostMapping("/add")
	public CauThu addCauThu(@RequestBody CauThu CauThu) {
		cauThuService.save(CauThu);
		return CauThu;
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCauThu(@PathVariable Integer id) {
		cauThuService.delete(id);
	}

	@PutMapping("/update/")
	public CauThu updateCauThu(@RequestBody CauThu CauThu) {
		CauThu temp = cauThuService.findOne(CauThu.getId());
		if (temp != null) {
			System.out.println("update id:: " + temp.getId());
			cauThuService.save(CauThu);
		} else {
			System.out.println("Not exsit id! ");
		}
		return CauThu;
	}

	@PostMapping("/insert/")
	public CauThu insertCauThu(@RequestBody CauThu CauThu) {
		cauThuService.save(CauThu);
		return CauThu;
	}
}
