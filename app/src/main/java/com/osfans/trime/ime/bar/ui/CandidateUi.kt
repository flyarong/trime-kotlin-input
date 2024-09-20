// SPDX-FileCopyrightText: 2024 Rime community
//
// SPDX-License-Identifier: GPL-3.0-or-later

package com.osfans.trime.ime.bar.ui

import android.content.Context
import android.view.View
import com.osfans.trime.R
import splitties.dimensions.dp
import splitties.views.dsl.constraintlayout.before
import splitties.views.dsl.constraintlayout.centerVertically
import splitties.views.dsl.constraintlayout.constraintLayout
import splitties.views.dsl.constraintlayout.endOfParent
import splitties.views.dsl.constraintlayout.lParams
import splitties.views.dsl.constraintlayout.startOfParent
import splitties.views.dsl.core.Ui
import splitties.views.dsl.core.add

class CandidateUi(
    override val ctx: Context,
    private val compatView: View,
) : Ui {
    val unrollButton =
        ToolButton(ctx, R.drawable.ic_baseline_expand_more_24).apply {
            visibility = View.INVISIBLE
        }

    override val root =
        ctx.constraintLayout {
            add(
                unrollButton,
                lParams(dp(40)) {
                    centerVertically()
                    endOfParent()
                },
            )
            add(
                compatView,
                lParams {
                    centerVertically()
                    startOfParent()
                    before(unrollButton)
                },
            )
        }
}
