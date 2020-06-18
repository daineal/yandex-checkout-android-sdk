/*
 * The MIT License (MIT)
 * Copyright © 2018 NBCO Yandex.Money LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the “Software”), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package ru.yandex.money.android.sdk.impl.metrics

import android.content.Context
import android.util.Log
import com.yandex.metrica.YandexMetrica
import ru.yandex.money.android.sdk.BuildConfig
import ru.yandex.money.android.sdk.model.SdkException
import ru.yandex.money.android.sdk.model.UnhandledException

internal class YandexMetricaReporter(context: Context) : Reporter {

//    private val metrica = YandexMetrica.getReporter(context.applicationContext, BuildConfig.APP_METRICA_KEY)

    override fun report(name: String, args: List<Param>?) {

    }
//          val a: Int = 1
//        metrica.reportEvent(name, args?.associate { it.name to it.value })
}

internal class YandexMetricaErrorReporter(context: Context) : ErrorReporter {

//    private val metrica = YandexMetrica.getReporter(context.applicationContext, BuildConfig.APP_METRICA_KEY)

    override fun report(e: SdkException) {

    }
}

internal class YandexMetricaExceptionReporter(context: Context) : ExceptionReporter {

//    private val metrica = YandexMetrica.getReporter(context.applicationContext, BuildConfig.APP_METRICA_KEY)

    override fun report(e: UnhandledException){

    }
}

internal class YandexMetricaSessionReporter(context: Context) : SessionReporter {

//    private val metrica = YandexMetrica.getReporter(context.applicationContext, BuildConfig.APP_METRICA_KEY)

    override fun resumeSession() {

    }

    override fun pauseSession() {

    }
}
