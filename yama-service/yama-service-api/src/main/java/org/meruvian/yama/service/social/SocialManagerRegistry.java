/**
 * Copyright 2014 Meruvian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.meruvian.yama.service.social;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dian Aditya
 *
 */
public class SocialManagerRegistry implements SocialManagerLocator {
	private List<SocialManager<?>> socialManagers = new ArrayList<SocialManager<?>>();
	
	public void setSocialManagers(List<SocialManager<?>> socialManagers) {
		this.socialManagers = socialManagers;
	}

	@Override
	public SocialManager<?> getSocialManager(String name) {
		for (SocialManager<?> manager : socialManagers) {
			if (manager.getProviderName().equalsIgnoreCase(name)) {
				return manager;
			}
		}
		
		return null;
	}
}