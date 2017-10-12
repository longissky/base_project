package com.jw.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jw.common.swagger.Result;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("test")
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ApiOperation(value = "根据用户名获取用户对象", httpMethod = "GET", response = Result.class, notes = "根据用户名获取用户对象")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "用户ID", required = false, dataType = "Long"),  
        @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "path") })
	public Result<String> getUserByUserName(Long id, @PathVariable String name) {
		Result<String> result = new Result<String>(200, "", "get");
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	@ApiOperation(value = "创建用户", httpMethod = "POST", response = Result.class, notes = "创建用户")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	public Result<String> createUser(@PathVariable Long id) {
		Result<String> result = new Result<String>(200, "", "post");
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除用户", httpMethod = "DELETE", response = Result.class, notes = "删除用户")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	public Result<String> deleteUser(@PathVariable Long id) {
		Result<String> result = new Result<String>(200, "", "delete");
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "更新用户", httpMethod = "PUT", response = Result.class, notes = "更新用户")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
	public Result<String> updateUser(@PathVariable Long id) {
		Result<String> result = new Result<String>(200, "", "put");
		return result;
	}
}
