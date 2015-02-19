/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.backends.migeran;

import ios.objectal.OALAudioTrack;
import ios.objectal.OALSimpleAudio;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class IOSAudio implements Audio {

	public IOSAudio(IOSApplicationConfiguration config) {
		OALSimpleAudio.sharedInstance().setAllowIpod(config.allowIpod);
		OALSimpleAudio.sharedInstance().setHonorSilentSwitch(true);
	}
	
	@Override
	public AudioDevice newAudioDevice (int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AudioRecorder newAudioRecorder (int samplingRate, boolean isMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sound newSound (FileHandle fileHandle) {
		return new IOSSound(fileHandle);
	}

	@Override
	public Music newMusic (FileHandle fileHandle) {
		String path = fileHandle.file().getPath().replace('\\', '/');
		OALAudioTrack track = OALAudioTrack.alloc().init();
		if (track != null) {
			if (track.preloadFile(path)) {
				IOSMusic iOSMusic = IOSMusic.alloc().init();
				iOSMusic.iOSMusic(track);
				return iOSMusic;
			}
		}
		throw new GdxRuntimeException("Error opening music file at " + path);
	}

}