//package com.qa.interprability;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.qa.persistant.Account;
//import com.qa.buisiness.service.LoginService;
//
//@RequestMapping(value = "/products")
//@RestController
//public class Endpoints
//{
//	@Autowired
//	LoginService loginService;
//
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<Object> getAccount()
//	{
//		return new ResponseEntity<>(loginService.getAccounts(), HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
//	public ResponseEntity<Object> updateAccount(@PathVariable("id") ObjectId id, @RequestBody Account account)
//	{
//		loginService.updateAccount(id, account);
//		return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<Object> deleteAccount(@PathVariable("id") ObjectId id)
//	{
//		loginService.deleteAccount(id);
//		return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "", method = RequestMethod.POST)
//	public ResponseEntity<Object> createAccount(@RequestBody Account account)
//	{
//		loginService.createAccount(account);
//		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
//	}
//}
