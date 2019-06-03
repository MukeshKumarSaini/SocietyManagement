package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.societymanagement.DaoImpl.MemberImpl;
import com.societymanagement.Entity.Member;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	MemberImpl memberImpl;

	@RequestMapping(value = "/addMember", method = RequestMethod.POST)
	public boolean addMember(@RequestBody Member member) {
		return memberImpl.addMember(member);
	}

	@RequestMapping(value = "/allMember", method = RequestMethod.GET)
	public List<Member> allMember() {
		return memberImpl.allMember();

	}

	@RequestMapping(value = "/getMember/{id}", method = RequestMethod.GET)
	public Member getCategory(@PathVariable("id") int memberId) {
		return memberImpl.getMember(memberId);
	}

	@RequestMapping(value = "/updateMember/{id}", method = RequestMethod.PUT)
	public boolean updateMember(@RequestBody Member member,@PathVariable("id") int memberId) {
		return memberImpl.updateMember(member, memberId);

	}

	@RequestMapping(value = "/deleteMember/{id}", method = RequestMethod.GET)
	public boolean deleteMember(@PathVariable("id") int memberId) {
		return memberImpl.deleteMember(memberId);

	}

}
