package com.jmao5.photogramstart.web.dto.user;

import com.jmao5.photogramstart.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfileDto {
	private boolean pageOwnerState;
	private int imageCount;
	private boolean subscribeState;
	private int subscribeCount;
	private User user;
}
