//
//  SimpleFilterManager.h
//
//  Created by xianing on 2021/7/27.
//  Copyright © 2021 Agora Corp. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <AgoraRtcKit/AgoraMediaFilterEventDelegate.h>

// 设置发音人的名称
NS_ASSUME_NONNULL_BEGIN

@interface DBVoiceConvertFilterManager : NSObject<AgoraMediaFilterEventDelegate>

+ (instancetype)sharedInstance;

+ (NSString * __nonnull)vendorName;



@end

NS_ASSUME_NONNULL_END
